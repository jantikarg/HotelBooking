package com.booking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOTEL")
public class Hotel implements Serializable{

	private static final long serialVersionUID = -1328104247192467980L;

	@Id
	@Column(name="HOTEL_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int hotelId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="ROOMS")
	private int numberOfRooms;
	
	@Column(name="RATING")
	private int starRating;
	
	@Column(name="TARIFF")
	private long tariff;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	public long getTariff() {
		return tariff;
	}

	public void setTariff(long tariff) {
		this.tariff = tariff;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", name=" + name + ", city="
				+ city + ", numberOfRooms=" + numberOfRooms + ", starRating="
				+ starRating + ", tariff=" + tariff + "]";
	}
	
}
