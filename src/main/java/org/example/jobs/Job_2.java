package org.example.jobs;

import org.example.task.TaskFunction;

import java.util.Date;
import java.util.TimerTask;

public class Job_2 extends TaskFunction {


    @Override
    public void run() {
        System.out.println("Second job");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-----");

    }
}
