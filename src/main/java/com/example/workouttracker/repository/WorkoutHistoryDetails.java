package com.example.workouttracker.repository;

import com.example.workouttracker.view.WorkoutHistoryDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkoutHistoryDetailsRepository extends JpaRepository<WorkoutHistoryDetails, Long> {

    WorkoutHistoryDetails findByExerciseInfoId(Long id);
    List<WorkoutHistoryDetails> findAll();
}
