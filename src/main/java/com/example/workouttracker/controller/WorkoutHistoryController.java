package com.example.workouttracker.controller;

import com.example.workouttracker.repository.WorkoutHistoryDetailsRepository;
import com.example.workouttracker.view.WorkoutHistoryDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/workoutHistory")
@RequiredArgsConstructor
public class WorkoutHistoryController {

    private final WorkoutHistoryDetailsRepository workoutHistoryDetailsRepository;

    @GetMapping()
    public ResponseEntity<List<WorkoutHistoryDetails>> getAllWorkoutHistory(){
        List<WorkoutHistoryDetails> workoutHistoryDetails = workoutHistoryDetailsRepository.findAll();
        return new ResponseEntity<>(workoutHistoryDetails, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkoutHistoryDetails> getAllWorkoutHistory(
            @PathVariable Long id
    ){
        WorkoutHistoryDetails workoutHistoryDetails = workoutHistoryDetailsRepository.findByWorkoutId(id);
        return new ResponseEntity<>(workoutHistoryDetails, HttpStatus.OK);
    }
}
