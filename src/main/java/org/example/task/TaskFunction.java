package org.example.task;

import java.util.TimerTask;

public abstract class TaskFunction extends TimerTask {

    @Override
    public void run(){
        System.out.println("----");
    }
}
