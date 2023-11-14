package org.bookmyshowproject.service;

import org.bookmyshowproject.model.Movie;
import org.bookmyshowproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	public MovieRepository movieRepository;

	public Movie addMovie(Movie movie) {
		return movieRepository.saveAndFlush(movie);
	}

	public int getId(int id) {
		System.out.println("Id::" + id);
		System.out.println(movieRepository.findById(id));

		return movieRepository.findById(id).getId();
	}

	@Override
	public Movie addMovie(MovieService Movie) {
		// TODO Auto-generated method stub
		return null;
	}
}
