package com.exercise.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomThreadPool {
    private final ExecutorService executor;

    public CustomThreadPool(int nThreads) {
        this.executor = Executors.newFixedThreadPool(nThreads);
    }

    public void executeTask(Runnable task) {
        executor.execute(task);
    }

    public void shutdown() {
        executor.shutdown();
    }

    public static void main(String[] args) {
        CustomThreadPool pool = new CustomThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            pool.executeTask(() -> {
                System.out.println("Custom Pool Task executed by " + Thread.currentThread().getName());
            });
        }

        pool.shutdown();
    }
}

