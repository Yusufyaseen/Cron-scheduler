# Cron-scheduler

## A Brief description of the solution.
#### 1- ``` User can add his tasks with it is methods.
#### 2- Each task has it is own id, function (job), expected interval (should be after the current time) and scheduling frequency.
#### 3- And each job is a class extending from an abstract class (TashFunction).
#### 4- Then, there is a list containing all the tasks user has identified.
#### 5- Lastly all tasks can run concurrently.
