package com.maximslepukhin.labs.concurrency;

import com.maximslepukhin.labs.concurrency.counter.SynchronizedCounter;
import com.maximslepukhin.labs.concurrency.counter.UnsafeCounter;
import com.maximslepukhin.labs.concurrency.experiment.CounterExperiment;

public final class RaceConditionDemo {
    private static final int THREAD_COUNT = 8;
    private static final int INCREMENTS_PER_THREAD = 10_000;

    private RaceConditionDemo() {
    }

    public static void main(String[] args) throws InterruptedException {
        var experiment = new CounterExperiment(THREAD_COUNT, INCREMENTS_PER_THREAD);
        int unsafeResult = experiment.run(new UnsafeCounter());
        int synchronizedResult = experiment.run(new SynchronizedCounter());
        int expected = experiment.expectedResult();

        printReport(expected, unsafeResult, synchronizedResult);

        if (unsafeResult >= expected || synchronizedResult != expected) {
            System.out.println("LAB RESULT: FAILED");
            System.exit(1);
        }
        System.out.println("LAB RESULT: PASSED");
    }

    private static void printReport(int expected, int unsafeResult, int synchronizedResult) {
        System.out.println("============================================");
        System.out.println("LAB: JV-CON-001 — Race Condition");
        System.out.println("============================================");
        System.out.printf("Expected increments:       %d%n", expected);
        System.out.printf("Unsafe counter result:     %d%n", unsafeResult);
        System.out.printf("Synchronized result:       %d%n", synchronizedResult);
        System.out.println();
        System.out.println(unsafeResult < expected
                ? "RACE CONDITION OBSERVED: updates were lost."
                : "Race was not observed on this run; try running the lab again.");
        System.out.println(synchronizedResult == expected
                ? "SYNCHRONIZED COUNTER PASSED: no updates were lost."
                : "SYNCHRONIZED COUNTER FAILED.");
    }
}

