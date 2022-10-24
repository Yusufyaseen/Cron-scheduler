package org.example.jobs;

import org.example.task.TaskFunction;

import java.util.TimerTask;

public class Job_1 extends TaskFunction {

    @Override
    public void run() {
        System.out.println("First job");
    }
}
