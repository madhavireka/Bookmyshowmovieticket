package org.bookmyshowproject.repository;

import org.bookmyshowproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findById(int id);
}
