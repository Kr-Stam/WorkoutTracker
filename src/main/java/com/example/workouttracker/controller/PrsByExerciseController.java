package com.example.workouttracker.controller;

import com.example.workouttracker.repository.PrsByExerciseRepository;
import com.example.workouttracker.view.PrsByExercise;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/PrsByExercise")
@RequiredArgsConstructor

public class PrsByExerciseController {

    private final PrsByExerciseRepository prsByExerciseRepository;

    @GetMapping()
    public ResponseEntity<List<PrsByExercise>> getAllPrsByExercise(){
        List<PrsByExercise> PrsByExercise = prsByExerciseRepository.findAll();
        return new ResponseEntity<>(PrsByExercise, HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<PrsByExercise> getAllPrsByExercise(
            @PathVariable Long id
    ){
        PrsByExercise prsByExercise = prsByExerciseRepository.findByExerciseInfoId(id);
        return new ResponseEntity<>(prsByExercise, HttpStatus.OK);
    }
}
