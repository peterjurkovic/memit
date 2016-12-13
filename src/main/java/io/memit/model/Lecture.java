package io.memit.model;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.memit.utils.DateTimeUtils;

@Entity
@Table(name = "m_lecture")
@SequenceGenerator(name = "m_lecture_id_seq", sequenceName = "m_lecture_id_seq", allocationSize = 1)
public class Lecture extends SynchronizableEntity{

	private Book book;
	private String name;
	private Lang questionLang;
	private Lang answerLang;
	private OffsetDateTime created;
	
	public Lecture() {
		super();
		setChanged(DateTimeUtils.localNow());
	}
	
	@Id
	@Override
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "m_lecture_id_seq")
	public Long getId() {
		return super.getId();
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id")
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	@Column(name = "book_name", nullable = false, length = 120)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "lang_question", length = 2)
	public Lang getQuestionLang() {
		return questionLang;
	}

	public void setQuestionLang(Lang questionLang) {
		this.questionLang = questionLang;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name = "lang_answer", length = 2)
	public Lang getAnswerLang() {
		return answerLang;
	}

	public void setAnswerLang(Lang answerLang) {
		this.answerLang = answerLang;
	}
	
	@Column(nullable = false)
	public OffsetDateTime getCreated() {
		return created;
	}

	public void setCreated(OffsetDateTime created) {
		this.created = created;
	}
	
	
}
