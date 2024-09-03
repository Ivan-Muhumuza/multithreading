package com.exercise.sync;

public class SynchronizedCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("Count after increment: " + count + " by " + Thread.currentThread().getName());
    }

    public int getCount() {
        return count;
    }
}


