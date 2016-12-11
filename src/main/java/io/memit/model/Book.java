//package io.memit.model;
//
//import java.time.OffsetDateTime;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "m_book")
//@SequenceGenerator(name = "m_book_id_seq", sequenceName = "m_book_id_seq", allocationSize =1)
//public class Book extends SynchronizableEntity {
//
//	private String name;
//	private Language questionLang;
//	private Language answerLang;
//	private User author;
//	private OffsetDateTime created;
//	private boolean published;
//	
//	
//	@Id
//	@Override
//	@Column(name = "id")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "m_book_id_seq")
//	public Long getId() {
//		return super.getId();
//	}
//	
//
//}
