package com.example.test.model;

public class TaskTypeAmount {
    private TaskType taskType;
    private Long amount;

    public TaskTypeAmount() {}

    public TaskTypeAmount(TaskType taskType, Long amount) {
        this.taskType = taskType;
        this.amount = amount;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
