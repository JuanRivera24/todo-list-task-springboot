package com.taskapi.taskapi.tasks.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor

public class Taskcontroller {

    @GetMapping
    public ResponseEntity<String> getAllTasks() {

        return ResponseEntity.ok("Get Tasks");
    }
}
