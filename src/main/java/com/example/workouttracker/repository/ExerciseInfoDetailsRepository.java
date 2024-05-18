package com.example.workouttracker.repository;

import com.example.workouttracker.view.ExerciseInfoDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseInfoDetailsRepository extends JpaRepository<ExerciseInfoDetails, Long> {

    ExerciseInfoDetails findByExerciseInfoId(Long id);
    List<ExerciseInfoDetails> findAll();
}
