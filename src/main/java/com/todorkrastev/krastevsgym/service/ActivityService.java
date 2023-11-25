package com.todorkrastev.krastevsgym.service;

import com.todorkrastev.krastevsgym.model.dto.ActivityDto;

import java.util.List;

public interface ActivityService {
    List<ActivityDto> findAll();

    ActivityDto getActivityById(Long activityId);

    ActivityDto updateActivityById(Long activityId, ActivityDto activityDTO);

    Long createActivity(ActivityDto newActivity);

    void deleteActivityById(Long activityId);
}
