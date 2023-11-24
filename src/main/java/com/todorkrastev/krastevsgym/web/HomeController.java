package com.todorkrastev.krastevsgym.web;

import com.todorkrastev.krastevsgym.model.dto.ActivityDto;
import com.todorkrastev.krastevsgym.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
//@CrossOrigin({"http://localhost:4200", "https://todorkrastev.com"}) -> multiple
//@CrossOrigin -> wildcard (any website)
@RestController
@RequestMapping("/api/v1")
public class HomeController {

    private final ActivityService activityService;

    public HomeController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping
    public ResponseEntity<List<ActivityDto>> getAllActivities() {
        return ResponseEntity
                .ok(this.activityService.findAll());
    }
}
