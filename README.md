# Cron-scheduler

## A Brief description of the solution.
#### 1- User can add his tasks with it is methods.
#### 2- Each task has it is own id, function (job), expected interval (should be after the current time) and scheduling frequency.
#### 3- And each job is a class extending from an abstract class (TashFunction).
#### 4- Then, there is a list containing all the tasks user has identified.
#### 5- Lastly all tasks can run concurrently.

## Reasoning behind your technical decisions.

#### 1- I have implemented each job extending from an abstract class to make it possible to apply the Liskov Substitution Principle and user can identify it is own business logic on it.
#### 2- I have implemented each task as a class containing it is own id, function (job), expected interval (should be after the current time or it will throw an exception) and scheduling frequency.
#### 3- All tasks should be added to a list and then the timer classes get the data of the identified tasks, And there is a loop over the whole list and the jobs can be executed concurrently.
 
## Possible future improvements.
#### - We may adjust a way so the functions can be identified in the running time.
 

