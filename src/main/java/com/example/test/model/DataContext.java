package com.example.test.model;

public class DataContext {

    private TaskType taskType;
    private String taskName;
    private Long teamSize;
    private String description;

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Long getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Long teamSize) {
        this.teamSize = teamSize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataContext() {}

    public DataContext(TaskType taskType, String taskName, Long teamSize, String description) {
        this.taskType = taskType;
        this.taskName = taskName;
        this.teamSize = teamSize;
        this.description = description;
    }
}
