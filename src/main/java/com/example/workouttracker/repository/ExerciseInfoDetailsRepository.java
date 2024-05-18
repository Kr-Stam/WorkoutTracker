package com.example.workouttracker.repository;

import com.example.workouttracker.view.ExerciseInfoDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseInfoDetailsRepository extends JpaRepository<ExerciseInfoDetails, Long> {

    ExerciseInfoDetails findByExerciseInfoId(Long id);
}
