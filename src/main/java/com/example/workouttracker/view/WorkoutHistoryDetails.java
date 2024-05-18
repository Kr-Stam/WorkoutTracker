package com.example.workouttracker.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity(name = "workout_history_details")
public class WorkoutHistoryDetails implements Serializable{
    @Id
    Long workoutId;
    Long date;
    Long exerciseId;
    String exerciseName;
    Long setId;
    int reps;
    int setValue;
    String setType;
    int prValue;
}
