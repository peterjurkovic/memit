package io.memit.model;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class SynchronizableEntity extends IdentifiableByLongEntity  {

	private LocalDateTime changed;

	public LocalDateTime getChanged() {
		return changed;
	}

	public void setChanged(LocalDateTime changed) {
		this.changed = changed;
	}
	
	
}
