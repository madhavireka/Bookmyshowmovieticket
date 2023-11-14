package org.bookmyshowproject.controller;

import org.bookmyshowproject.model.Movie;
import org.bookmyshowproject.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieticketbooking/movie")
public class MovieController {
	@Autowired
	public MovieService movieService;

	@PostMapping("/add")
	public Movie addNewMovie(@RequestBody Movie movie) {

		return movieService.addMovie(movie);
	}

	@GetMapping("/id")
	public int getId(@RequestParam Integer id) {
		return movieService.getId(id);
	}
}
