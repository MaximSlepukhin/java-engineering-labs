package com.maximslepukhin.labs.concurrency.counter;

public final class SynchronizedCounter implements Counter {
    private int value;

    @Override
    public synchronized void increment() {
        value++;
    }

    @Override
    public synchronized int value() {
        return value;
    }
}

