package org.example;

import org.example.jobs.Job_1;
import org.example.jobs.Job_2;
import org.example.jobs.Job_3;
import org.example.task.Task;
import org.example.task.TaskFunction;
import org.example.utils.Helpers;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Task> listOfTasks = new LinkedList<>();

        LocalDateTime localDateTime =
                Helpers.getLocalDateTime(2022, 10, 24, 20, 29, 50);
        LocalDateTime localDateTime2 =
                Helpers.getLocalDateTime(2022, 10, 24, 20, 29, 50);
        LocalDateTime localDateTime3 =
                Helpers.getLocalDateTime(2022, 10, 24, 20, 29, 40);

        TaskFunction job_1 = new Job_1();
        TaskFunction job_2 = new Job_2();
        TaskFunction job_3 = new Job_3();

        Task task1 = new Task("1", localDateTime, job_1, 0.07);
        Task task2 = new Task("2", localDateTime2, job_2, 0.05);
        Task task3 = new Task("3", localDateTime3, job_3, 0.05);

        listOfTasks.add(task1);
        listOfTasks.add(task2);
        listOfTasks.add(task3);

        for (Task task: listOfTasks) {
            Timer timer = new Timer(task.getId());
            timer.schedule(
                    task.getTaskFunction(),
                    Helpers.getActualHelper(task.getLocalDateTime()),
                    Helpers.convertToMilliSeconds(task.getTimeFrequencyInMinutes())
            );
        }
    }
}