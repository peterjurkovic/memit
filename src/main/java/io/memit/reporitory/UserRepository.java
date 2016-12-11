package io.memit.reporitory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.memit.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	
	public User findByEmailOrUsername(String emailOrUsername);
}
