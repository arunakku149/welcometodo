package com.todoapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoapp.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
	
	List<Task> findByUserId(Long userId);
	List<Task> findByUserIdAndStatus(Long userId, String status);

}
