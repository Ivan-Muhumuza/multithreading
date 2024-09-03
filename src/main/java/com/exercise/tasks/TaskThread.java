package com.exercise.tasks;

public class TaskThread extends Thread {
    private String taskName;

    public TaskThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Executing task: " + taskName + " by " + Thread.currentThread().getName());
    }
}

