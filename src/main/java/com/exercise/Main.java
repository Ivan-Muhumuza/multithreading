package com.exercise;

import com.exercise.sync.SynchronizedCounter;
import com.exercise.tasks.TaskRunnable;
import com.exercise.tasks.TaskThread;

public class Main {

    public static void main(String[] args) {
        Main mainInstance = new Main();

        // Thread creation and lifecycle management
        mainInstance.threadCreationAndLifecycle();

        // Thread synchronization
        mainInstance.threadSynchronization();
    }


    private void threadCreationAndLifecycle() {
        // Using Runnable
        Runnable task1 = new TaskRunnable("Runnable Task");
        Thread thread1 = new Thread(task1);
        thread1.start();

        // Using Thread
        Thread thread2 = new TaskThread("Thread Task");
        thread2.start();

        // Observing thread states after starting
        System.out.println();
        System.out.println("Thread1 state after start: " + thread1.getState());
        System.out.println("Thread2 state after start: " + thread2.getState());
        System.out.println();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final states
        System.out.println();
        System.out.println("Thread1 final state: " + thread1.getState());
        System.out.println("Thread2 final state: " + thread2.getState());
        System.out.println();
    }


    private void threadSynchronization() {
        SynchronizedCounter counter = new SynchronizedCounter();

        Runnable incrementTask = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final states
        System.out.println();
        System.out.println("T1 final state: " + t1.getState());
        System.out.println("T2 final state: " + t2.getState());
        System.out.println();
        System.out.println("Final count value: " + counter.getCount());
    }
}

