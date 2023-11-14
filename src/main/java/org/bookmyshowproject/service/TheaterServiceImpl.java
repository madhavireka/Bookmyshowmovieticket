package org.bookmyshowproject.service;

import org.bookmyshowproject.model.Theater;
import org.bookmyshowproject.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheaterServiceImpl implements TheaterService {
	@Autowired
	public TheaterRepository theaterRepository;

	@Override
	public Theater addTheater(Theater theater) {

		return theaterRepository.saveAndFlush(theater);
	}

	@Override
	public String getName(String name) {

		return theaterRepository.findByName(name).getName();
	}

	@Override
	public Theater addTheater(TheaterService theater) {
		// TODO Auto-generated method stub
		return null;
	}

}
