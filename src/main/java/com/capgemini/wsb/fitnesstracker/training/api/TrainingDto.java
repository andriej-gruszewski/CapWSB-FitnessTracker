package com.capgemini.wsb.fitnesstracker.training.api;

import com.capgemini.wsb.fitnesstracker.training.internal.ActivityType;
import com.capgemini.wsb.fitnesstracker.user.api.UserDto;
import jakarta.annotation.Nullable;
import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Builder
@Value
public class TrainingDto {
    @Nullable
    Long id;
    @Nullable
    UserDto user;
    Date startTime;
    Date endTime;
    ActivityType activityType;
    @Nullable
    Double distance;
    @Nullable
    Double averageSpeed;


    public TrainingDto(@Nullable Long id,
                       @Nullable UserDto user,
                       Date startTime,
                       Date endTime,
                       ActivityType activityType,
                       @Nullable Double distance,
                       @Nullable Double averageSpeed) {
        this.id = id;
        this.user = user;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activityType = activityType;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
    }

    public static TrainingDto from(Training training) {
        return TrainingDto.builder()
                .id(training.getId())
                .user(UserDto.from(training.getUser()))
                .startTime(training.getStartTime())
                .endTime(training.getEndTime())
                .activityType(training.getActivityType())
                .distance(training.getDistance())
                .averageSpeed(training.getAverageSpeed())
                .build();
    }
}