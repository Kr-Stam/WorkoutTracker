package com.example.workouttracker.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity(name = "prs_by_exercise")
public class PrsByExercise implements Serializable{
    @Id
    Long exerciseInfoId;
    String exerciseName;
    Long date;
    Long prValue;
}
