package com.example.test.model;

public class TeamTask {
    private String teamName;
    private String taskName;

    public TeamTask(String teamName, String taskName) {
        this.teamName = teamName;
        this.taskName = taskName;
    }

    public TeamTask() {}

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
