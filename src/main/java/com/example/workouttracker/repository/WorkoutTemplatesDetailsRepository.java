package com.example.workouttracker.repository;

import com.example.workouttracker.view.ExerciseInfoDetails;
import com.example.workouttracker.view.WorkoutHistoryDetails;
import com.example.workouttracker.view.WorkoutTemplatesDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkoutTemplatesDetailsRepository extends JpaRepository<WorkoutTemplatesDetails, Long> {
    WorkoutTemplatesDetails findByWorkoutId(Long id);
    List<WorkoutTemplatesDetails> findAll();
}

