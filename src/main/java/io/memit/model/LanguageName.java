package io.memit.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LanguageName {
	
	private String name;

	@Column(name = "language_name", nullable = false, length = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
