package com.javarush.jira.bugtracking.task;

import com.javarush.jira.bugtracking.Handlers;
import com.javarush.jira.bugtracking.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
@RequestMapping("/api/test")
public class TaskTimingTestController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private Handlers.TaskHandler handler;

    @GetMapping("/timing")
    public String testTiming() {
        try {
            Task task = handler.getRepository().getExisted(1L);

            Duration workTime = taskService.getTimeInWork(task);
            Duration testingTime = taskService.getTimeInTesting(task);

            return "=== РЕЗУЛЬТАТЫ ПРОВЕРКИ ===\n" +
                    "Задача ID: " + task.getId() + "\n" +
                    "Время в работе: " + workTime.toHours() + " часов " +
                    (workTime.toMinutes() % 60) + " минут\n" +
                    "Время на тестировании: " + testingTime.toHours() + " часов " +
                    (testingTime.toMinutes() % 60) + " минут\n" +
                    "=========================";

        } catch (Exception e) {
            return "Ошибка: " + e.getMessage();
        }
    }
}