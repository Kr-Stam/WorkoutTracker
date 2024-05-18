package com.example.workouttracker.view;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity(name = "exercise_info_details")
public class ExerciseInfoDetails implements Serializable {
    @Id
    Long exerciseInfoId;

    String exerciseName;
    String exerciseDescription;
    String imageSrc;
    String exerciseTagName;
}
