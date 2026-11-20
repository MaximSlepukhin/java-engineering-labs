package com.maximslepukhin.labs.concurrency.experiment;

import com.maximslepukhin.labs.concurrency.counter.Counter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class CounterExperiment {
    private final int threadCount;
    private final int incrementsPerThread;

    public CounterExperiment(int threadCount, int incrementsPerThread) {
        if (threadCount <= 0 || incrementsPerThread <= 0) {
            throw new IllegalArgumentException("Experiment parameters must be positive");
        }
        this.threadCount = threadCount;
        this.incrementsPerThread = incrementsPerThread;
    }

    public int run(Counter counter) throws InterruptedException {
        CountDownLatch ready = new CountDownLatch(threadCount);
        CountDownLatch start = new CountDownLatch(1);
        List<Thread> threads = new ArrayList<>();

        for (int threadNumber = 0; threadNumber < threadCount; threadNumber++) {
            threads.add(Thread.ofPlatform().start(() -> increment(counter, ready, start)));
        }

        ready.await();
        start.countDown();
        for (Thread thread : threads) {
            thread.join();
        }
        return counter.value();
    }

    public int expectedResult() {
        return threadCount * incrementsPerThread;
    }

    private void increment(Counter counter, CountDownLatch ready, CountDownLatch start) {
        ready.countDown();
        try {
            start.await();
        } catch (InterruptedException interrupted) {
            Thread.currentThread().interrupt();
            return;
        }

        for (int increment = 0; increment < incrementsPerThread; increment++) {
            counter.increment();
        }
    }
}

