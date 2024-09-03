package com.exercise.pool;

import com.exercise.tasks.TaskRunnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            executor.execute(new TaskRunnable("Pool Task " + i));
        }

        executor.shutdown();
    }
}

