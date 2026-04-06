package com.tracker.Personal_Tracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
	@Id//tels its aprimary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)//tels sql tht it auto increments
	private Long id;
	
	private String name;
	
	private boolean isCompleted;

	public Task() {}

	public Task(String name, boolean isCompleted) {
		super();
		this.name = name;
		this.isCompleted = isCompleted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	@Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + name + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }
	
	
	
}
