package io.memit.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.memit.utils.DateTimeUtils;


public class UserTest {
	
	private final static LocalDateTime NOW = LocalDateTime.of(2016, 12, 11, 19, 56, 0, 0);
	private User user;
	
	@Before
	public void setup(){
		user = new User();
	}
	
	@BeforeClass
	public static void beforeClass(){
		DateTimeUtils.useFixedClockAt( NOW );
	}
	
	@Test
	public void shouldCreateUserInVerifyEmailStatus(){
		assertThat(user.getStatus()).isEqualTo(UserStatus.VERIFY);
	}
	
	@Test
	public void shouldCreateUserWithCreatedNow(){
		assertThat(user.getCreated()).isEqualTo( NOW );
	}
	
	@Test
	public void shouldCreateUserWithChangedNow(){
		assertThat(user.getChanged()).isEqualTo( NOW );
	}
}
