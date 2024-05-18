package com.example.workouttracker.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity(name = "workout_templates_details")
public class WorkoutTemplatesDetails implements Serializable {
    @Id
    Long WorkoutId;

    String WorkoutName;
    Long ExerciseId;
    String ExerciseName;
    Long SetId;
    int Reps;
    int SetValue;
    String SetType;
}
