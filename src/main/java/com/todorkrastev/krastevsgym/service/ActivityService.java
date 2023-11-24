package com.todorkrastev.krastevsgym.service;

import com.todorkrastev.krastevsgym.model.dto.ActivityDto;

import java.util.List;

public interface ActivityService {
    List<ActivityDto> findAll();
}
