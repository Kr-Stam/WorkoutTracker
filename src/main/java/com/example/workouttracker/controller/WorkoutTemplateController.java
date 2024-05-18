package com.example.workouttracker.controller;

import com.example.workouttracker.repository.WorkoutTemplatesDetailsRepository;
import com.example.workouttracker.view.WorkoutTemplatesDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/workoutTemplate")
@RequiredArgsConstructor
public class WorkoutTemplateController {

    private final WorkoutTemplatesDetailsRepository workoutTemplateRepository;

    @GetMapping()
    public ResponseEntity<List<WorkoutTemplatesDetails>> getAllWorkoutTemplates(){
        List<WorkoutTemplatesDetails> result = workoutTemplateRepository.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkoutTemplatesDetails> getWorkoutTemplateById(
            @PathVariable Long id
    ){
        WorkoutTemplatesDetails result = workoutTemplateRepository.findByWorkoutId(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
