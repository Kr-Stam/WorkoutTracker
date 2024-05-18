package com.example.workouttracker.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity(name = "workout_templates_details")
public class WorkoutTemplatesDetails implements Serializable {
    @Id
    Long workoutId;

    String workoutName;
    Long exerciseId;
    String exerciseName;
    Long setId;
    int reps;
    int setValue;
    String setType;
}
