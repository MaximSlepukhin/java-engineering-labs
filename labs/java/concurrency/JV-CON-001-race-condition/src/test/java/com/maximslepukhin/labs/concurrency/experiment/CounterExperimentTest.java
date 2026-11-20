package com.maximslepukhin.labs.concurrency.experiment;

import com.maximslepukhin.labs.concurrency.counter.SynchronizedCounter;
import com.maximslepukhin.labs.concurrency.counter.UnsafeCounter;
import org.junit.jupiter.api.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CounterExperimentTest {
    private static final int THREAD_COUNT = 8;
    private static final int INCREMENTS_PER_THREAD = 1_000;

    private final CounterExperiment experiment =
            new CounterExperiment(THREAD_COUNT, INCREMENTS_PER_THREAD);

    @Test
    void synchronizedCounterPreservesEveryUpdate() throws InterruptedException {
        int result = experiment.run(new SynchronizedCounter());

        assertEquals(experiment.expectedResult(), result);
    }

    @Test
    void unsafeCounterLosesUpdatesInControlledInterleaving() throws InterruptedException {
        var barrier = new CyclicBarrier(THREAD_COUNT);
        var counter = new UnsafeCounter(() -> await(barrier));

        int result = experiment.run(counter);

        assertTrue(result < experiment.expectedResult(), "Unsafe updates should be lost");
    }

    private static void await(CyclicBarrier barrier) {
        try {
            barrier.await();
        } catch (InterruptedException interrupted) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Barrier wait was interrupted", interrupted);
        } catch (BrokenBarrierException brokenBarrier) {
            throw new IllegalStateException("Barrier was broken", brokenBarrier);
        }
    }
}

