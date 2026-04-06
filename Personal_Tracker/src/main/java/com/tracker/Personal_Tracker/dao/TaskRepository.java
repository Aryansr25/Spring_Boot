package com.tracker.Personal_Tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracker.Personal_Tracker.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
}
