package com.capgemini.wsb.fitnesstracker.training.api;

import com.capgemini.wsb.fitnesstracker.training.internal.ActivityType;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface TrainingProvider {

    Optional<Training> getTraining(Long trainingId);
    List<Training> findAllTrainings();
    List<Training> findFinishedTrainingsAfterTime(Date afterTime);
    List<Training> findTrainingsByActivityType(ActivityType activityType);
    List<Training> findTrainingsByUserIdAndDateRange(Long userId, Date startDate, Date endDate);
}