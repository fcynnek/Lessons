package com.coderscampus.lesson1;

public class TaskDto {
	private Double value;
	private Boolean finished=false;
	
	public Boolean getFinished() {
		return finished;
	}
	public void setFinished(Boolean finished) {
		this.finished = finished;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	
}
