package io.memit.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "m_level")
@SequenceGenerator(name = "m_level_id_seq", sequenceName = "m_level_id_seq", allocationSize = 1)
public class Level extends IdentifiableByShortEntity {

	private Map<String, LevelName> localized;

	@Id
	@Override
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "m_level_id_seq")
	public Short getId() {
		return super.getId();
	}

	@ElementCollection
	@CollectionTable(name = "m_level_locale")
	@MapKeyJoinColumn(name = "locale")
	public Map<String, LevelName> getLocalized() {
		return localized;
	}

	public void setLocalized(Map<String, LevelName> localized) {
		this.localized = localized;
	}

}
