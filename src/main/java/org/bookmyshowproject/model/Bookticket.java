package org.bookmyshowproject.model;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

@Table(name = "booktickets")
@Entity
public class Bookticket {
	@Id
	@Column(name = "ticket_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "movie_title")
	private String movietitle;

	@Column(name = "show_time")
	private String showtime;

	@Column(name = "Local_Date")
	private LocalDate localdate;

	@Column(name = "no_of_seats")
	private int seats;
	@Column(name = "theater_name")
	private String theaterName;
	@CreationTimestamp
	@Column(name = "last_modified")
	private Timestamp lastModified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMovieTitle(String movieTitle) {
		this.movietitle = movieTitle;
	}

	public String getMovieTitle() {
		return this.movietitle;
	}

	public String getShowTime() {
		return showtime;
	}

	public void setShowTime(String showTime) {
		this.showtime = showTime;
	}

	public LocalDate getLocaldate() {
		return localdate;
	}

	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}

	public int getNumOfSeats() {
		return seats;
	}

	public void setNumOfSeats(int seats) {
		this.seats = seats;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterName() {
		return this.theaterName;
	}

	public Timestamp getLastModified() {
		return lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

}
