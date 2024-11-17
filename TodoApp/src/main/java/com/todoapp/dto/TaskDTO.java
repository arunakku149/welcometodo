package com.todoapp.dto;

public class TaskDTO {
	
	private String title;
    private String description;
    private String status;
    private Long userId;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "TaskDTO [title=" + title + ", description=" + description + ", status=" + status + ", userId=" + userId
				+ "]";
	}
    
    
	

}
