package com.todorkrastev.krastevsgym.service.impl;

import com.todorkrastev.krastevsgym.model.dto.ActivityDto;
import com.todorkrastev.krastevsgym.model.entity.Activity;
import com.todorkrastev.krastevsgym.repository.ActivityRepository;
import com.todorkrastev.krastevsgym.service.ActivityService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityServiceImpl implements ActivityService {

    private ActivityRepository activityRepository;
    private ModelMapper modelMapper;

    public ActivityServiceImpl(ActivityRepository activityRepository, ModelMapper modelMapper) {
        this.activityRepository = activityRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ActivityDto> findAll() {
        return this.activityRepository
                .findAll()
                .stream()
                .map(activity -> this.modelMapper.map(activity, ActivityDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ActivityDto getActivityById(Long activityId) {
        Activity activity = this.activityRepository.findById(activityId).orElseThrow(() -> new ResourceNotFoundException("Activity", "id", activityId));

        return this.modelMapper.map(activity, ActivityDto.class);

        /*
        return this.activityRepository
                .findById(activityId)
                .map(activity ->
                        this.modelMapper
                                .map(activity, ActivityDTO.class));

         */
    }

    @Override
    public Long createActivity(ActivityDto newActivity) {
        Activity activityToSave = this.modelMapper.map(newActivity, Activity.class);

        this.activityRepository.save(activityToSave);

        return activityToSave.getId();
    }


    @Override
    public ActivityDto updateActivityById(Long activityId, ActivityDto activityDTO) {

        //TODO: Make a validation if the admin is doing the change

        Activity activity = this.activityRepository.findById(activityId).orElseThrow(() -> new ResourceNotFoundException("Activity", "id", activityId));

        activity.setTitle(activityDTO.getTitle());
        activity.setDescription(activityDTO.getDescription());
        activity.setImage(activityDTO.getDescription());

        Activity updatedActivity = this.activityRepository.save(activity);

        return this.modelMapper.map(updatedActivity, ActivityDto.class);
    }

    @Override
    public void deleteActivityById(Long activityId) {
        Activity activity = this.activityRepository.findById(activityId).orElseThrow(() -> new ResourceNotFoundException("Activity", "id", activityId));

        this.activityRepository.delete(activity);
    }
}
