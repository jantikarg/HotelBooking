package com.booking.service;

import java.util.List;

import com.booking.model.Booking;
import com.booking.model.Hotel;


public interface BookingService {

	public void addHotelBooking(Booking booking);
	public void updateHotelBooking(Booking booking);
	public List<Hotel> listHotels();
	
}
