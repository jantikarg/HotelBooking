package com.booking.dao;

import java.util.List;

import com.booking.model.Booking;
import com.booking.model.Hotel;


public interface BookingDAO {

	public void addHotelBooking(Booking booking);
	public void updateHotelBooking(Booking booking);
	public List<Hotel> listHotels();
}
