package com.example.workouttracker.controller;

import com.example.workouttracker.repository.ExerciseInfoDetailsRepository;
import com.example.workouttracker.view.ExerciseInfoDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exerciseInfo")
@RequiredArgsConstructor
public class ExerciseInfoController {

    private final ExerciseInfoDetailsRepository exerciseInfoDetailsRepository;

    @GetMapping()
    public ResponseEntity<List<ExerciseInfoDetails>> getAllExerciseInfoDetails(){
        List<ExerciseInfoDetails> result = exerciseInfoDetailsRepository.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<ExerciseInfoDetails> getExerciseInfoDetailsById(
            @PathVariable Long id
    ){
        ExerciseInfoDetails result = exerciseInfoDetailsRepository.findByExerciseInfoId(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
