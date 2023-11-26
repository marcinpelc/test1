package com.example.test;

import com.example.test.model.DataContext;
import com.example.test.model.TaskType;
import com.example.test.model.TeamTask;
import org.junit.jupiter.api.Test;

import java.util.List;

class SomeServiceTest {

    @Test
    void notImportantMethod() {

        List<DataContext> taskData = generateData();
        List<TeamTask> teamTasksData = getTeamTask();



        //get team task type amount
//        Map<String, TaskTypeAmount> teamTaskTypes = ?;
    }

    private List<TeamTask> getTeamTask() {
        return List.of(
                new TeamTask("teamX", "task2"),
                new TeamTask("teamY", "task3"),
                new TeamTask("teamX", "task1"),
                new TeamTask("teamY", "task4"),
                new TeamTask("teamZ", "task5")
        );
    }

    private List<DataContext> generateData() {
        return List.of(
                new DataContext(TaskType.MEDIUM, "task1", 2L, "First task for the team"),
                new DataContext(TaskType.MEDIUM, "task2", 3L, "Second task for the team"),
                new DataContext(TaskType.EASY, "task3", 10L, "Third task for the team"),
                new DataContext(TaskType.HARD, "task4", 1L, "Fourth task for the team"),
                new DataContext(TaskType.MEDIUM, "task5", 12L, "Fifth task for the team")
        );
    }
}