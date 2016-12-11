package io.memit.model;


import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import io.memit.utils.DateTimeUtils;

@Entity
@Table(name = "m_user")
@SequenceGenerator(name = "m_user_id_seq", sequenceName = "m_user_id_seq", allocationSize =1)
public class User extends IdentifiableByLongEntity implements UserDetails{

	private static final long serialVersionUID = 2655540417106363371L;
	
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private UserStatus status;
	private LocalDateTime created;
	private LocalDateTime changed;
	
	public User(){
		created = DateTimeUtils.localNow();
		changed = created;
		status = UserStatus.VERIFY;
	}
	
	@Id
	@Override
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "m_user_id_seq")
	public Long getId() {
		return super.getId();
	}
	
	@Column(length = 62, nullable = false)
	@Override
	public String getPassword() {
		return password;
	}

	@Override
	@Column(length = 32, nullable = false, unique = true)
	public String getUsername() {
		return username;
	}
	
	@Column(nullable = false, unique = true, length = 50)
	public String getEmail() {
		return email;
	}

	@Column(name= "first_name", length = 50)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name= "last_name", length = 50)
	public String getLastName() {
		return lastName;
	}
	
	@Enumerated(value = EnumType.STRING)
	@Column(name= "user_status", nullable = false, length = 10)
	public UserStatus getStatus() {
		return status;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setStatus(UserStatus status) {
		this.status = status;
	}
	
	public LocalDateTime getCreated() {
		return created;
	}

	public LocalDateTime getChanged() {
		return changed;
	}
	
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

	public void setChanged(LocalDateTime changed) {
		this.changed = changed;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	@Transient
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.emptyList();
	}	

	@Override
	@Transient
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	@Transient
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	@Transient
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	@Transient
	public boolean isEnabled() {
		return status == UserStatus.ACTIVE;
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}

	
}
