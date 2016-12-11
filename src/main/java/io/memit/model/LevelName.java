package io.memit.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LevelName {
	
	@Column(name = "level_name", nullable = false, length = 30)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
