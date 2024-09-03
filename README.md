# Multithreading Demonstration Project

[loom-video-link](https://www.loom.com/share/b30287d483b84f6f83ef6b148fc9375c)

## Overview

This Java project demonstrates key multithreading concepts including thread creation, lifecycle management, and synchronization. It uses both the `Runnable` interface and `Thread` class for creating threads, and illustrates thread synchronization through a shared counter. The project also showcases the modular organization of code for better readability and maintainability.

## Project Structure

- `Main.java`: Contains the main class where threads are created, managed, and synchronized.
- `tasks/TaskRunnable.java`: Implements a task using the `Runnable` interface.
- `tasks/TaskThread.java`: Extends the `Thread` class to implement a task.
- `sync/SynchronizedCounter.java`: Demonstrates thread-safe operations using synchronization.

## Features

1. **Thread Creation and Lifecycle Management:**
    - Demonstrates how to create and start threads using both `Runnable` and `Thread`.
    - Observes and prints the state of threads before and after execution.

2. **Thread Synchronization:**
    - Uses a synchronized counter to safely update a shared resource from multiple threads.
    - Ensures correct final counter value by using synchronization mechanisms.

3. **Code Organization:**
    - Separates concerns into methods for better clarity:
        - `threadCreationAndLifecycle()`: Manages thread creation, starting, and lifecycle observation.
        - `threadSynchronization()`: Handles thread synchronization and shared resource management.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher

### Running the Project

1. **Compile the Code:**
   Navigate to the project directory and compile the Java files using:
   ```sh
   javac -d bin src/com/exercise/*.java src/com/exercise/tasks/*.java src/com/exercise/sync/*.java
   ```
2. **Run the Main Class:**
   Execute the Main class to see the multithreading demonstration:
   ```sh
   java -cp bin com.exercise.Main
   ```
