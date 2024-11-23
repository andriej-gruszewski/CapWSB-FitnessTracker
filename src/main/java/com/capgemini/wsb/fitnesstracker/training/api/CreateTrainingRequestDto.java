package com.capgemini.wsb.fitnesstracker.training.api;

import lombok.Builder;
import lombok.Value;

import java.util.Date;
@Value
@Builder
public class CreateTrainingRequestDto {
    Long userId;
    Date startTime;
    Date endTime;
    String activityType;
    Double distance;
    Double averageSpeed;

    public CreateTrainingRequestDto(Long userId, Date startTime, Date endTime, String activityType, Double distance, Double averageSpeed) {
        this.userId = userId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activityType = activityType;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }
}