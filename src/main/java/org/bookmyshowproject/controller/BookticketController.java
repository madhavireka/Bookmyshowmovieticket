package org.bookmyshowproject.controller;

import org.bookmyshowproject.model.Bookticket;
import org.bookmyshowproject.service.BookticketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieticketbooking/booktickets")
public class BookticketController {

	@Autowired
	public BookticketService bookticketService;

	@PostMapping("/add")
	public Bookticket addTicket(@RequestBody Bookticket bookticket) {
		return bookticketService.addBookticket(bookticket);
	}

	@GetMapping("/id")
	public int getId() {
		int id = 0;
		return bookticketService.getId(id);
	}

}
