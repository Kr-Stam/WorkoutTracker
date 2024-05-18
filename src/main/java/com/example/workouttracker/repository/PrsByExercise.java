package com.example.workouttracker.repository;

import com.example.workouttracker.view.PrsByExercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrsByExerciseRepository extends JpaRepository<PrsByExercise, Long> {

    PrsByExercise findByExerciseInfoId(Long id);
    List<PrsByExercise> findAll();
}
