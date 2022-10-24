package org.example.task;

import org.example.jobs.Job_2;
import org.example.utils.Helpers;

import java.time.LocalDateTime;

public class Task {

    private String id;
    private LocalDateTime localDateTime;
    private TaskFunction taskFunction;
    private double timeFrequencyInMinutes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) throws Exception {
        if(localDateTime.isBefore(LocalDateTime.now())){
            throw new Exception("You have to put a valid date");
        }
        this.localDateTime = localDateTime;
    }

    public TaskFunction getTaskFunction() {
        return taskFunction;
    }

    public void setTaskFunction(TaskFunction taskFunction) {
        this.taskFunction = taskFunction;
    }

    public double getTimeFrequencyInMinutes() {
        return timeFrequencyInMinutes;
    }

    public void setTimeFrequencyInMinutes(double timeFrequencyInMinutes) {
        this.timeFrequencyInMinutes = timeFrequencyInMinutes;
    }

    public Task(String id, LocalDateTime localDateTime, TaskFunction taskFunction, double timeFrequencyInMinutes) throws Exception {
        this.id = id;
        setLocalDateTime(localDateTime);
        this.taskFunction = taskFunction;
        this.timeFrequencyInMinutes = timeFrequencyInMinutes;
    }
}
