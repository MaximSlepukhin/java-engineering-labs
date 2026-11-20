package com.maximslepukhin.labs.concurrency.counter;

import java.util.concurrent.locks.LockSupport;

public final class UnsafeCounter implements Counter {
    private final Runnable interleavingHook;
    private int value;

    public UnsafeCounter() {
        this(() -> LockSupport.parkNanos(1));
    }

    public UnsafeCounter(Runnable interleavingHook) {
        this.interleavingHook = interleavingHook;
    }

    @Override
    public void increment() {
        int current = value;
        interleavingHook.run();
        value = current + 1;
    }

    @Override
    public int value() {
        return value;
    }
}

