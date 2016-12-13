package io.memit.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import io.memit.utils.DateTimeUtils;

@MappedSuperclass
public class SynchronizableEntity extends IdentifiableByLongEntity implements Synchronizable  {

	private LocalDateTime changed;
	
	public SynchronizableEntity(){
		changed = DateTimeUtils.localNow();
	}
	
	@Column(nullable = false)
	public LocalDateTime getChanged() {
		return changed;
	}

	public void setChanged(LocalDateTime changed) {
		this.changed = changed;
	}
	
	
}
