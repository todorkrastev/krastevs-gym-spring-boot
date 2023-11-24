package com.todorkrastev.krastevsgym.repository;

import com.todorkrastev.krastevsgym.model.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
