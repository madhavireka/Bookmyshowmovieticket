package org.bookmyshowproject.repository;

import org.bookmyshowproject.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	public Movie findById(int id);

}
