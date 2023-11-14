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

@Table(name = "theater")
@Entity
public class Theater {

	@Id
	@Column(name = "theater_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "theater_name")
	private String name;

	@Column(name = "available_seats")
	private int seats;

	@Column(name = "show_time")
	private String time;

	@Column(name = "Local_Date")
	private LocalDate localdate;

	@Column(name = "contact_number")
	private String contactNumber;

	@Column(name = "address")
	private String address;
	@CreationTimestamp
	@Column(name = "last_modified")
	private Timestamp lastModified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getAvailableseats() {
		return seats;
	}

	public void setAvailableseats(int seats) {
		this.seats = seats;
	}

	public String getShowTime() {
		return time;
	}

	public void setShowTime(String time) {
		this.time = time;
	}

	public LocalDate getLocaldate() {
		return localdate;
	}

	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getLastModified() {
		return lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

}
