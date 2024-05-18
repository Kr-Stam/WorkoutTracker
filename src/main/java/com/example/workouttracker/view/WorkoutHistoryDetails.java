package com.example.workouttracker.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
@Entity(name = "workout_history_details")
public class WorkoutHistoryDetails implements Serializable{
    @Id
    Long WorkoutId;

    Long Date;
    Long ExerciseId;
    String ExerciseName;
    Long SetId;
    Long Reps;
    Long SetValue;
    String SetType;
    Long PrValue;
}
