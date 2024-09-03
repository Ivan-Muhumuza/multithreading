package com.exercise.tasks;

public class TaskRunnable implements Runnable {
    private String taskName;

    public TaskRunnable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Executing task: " + taskName + " by " + Thread.currentThread().getName());
    }
}

