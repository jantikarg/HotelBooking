package com.booking.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.booking.dao.BookingDAO;
import com.booking.dao.BookingDAOImpl;
import com.booking.model.Booking;
import com.booking.model.Hotel;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {
	
	private static final Logger logger = LoggerFactory.getLogger(BookingDAOImpl.class);
	
	@Autowired
	private BookingDAO bookingDAO;

	@Override
	public void addHotelBooking(Booking booking) {
		this.bookingDAO.addHotelBooking(booking);
	}

	@Override
	public void updateHotelBooking(Booking booking) {
		this.bookingDAO.updateHotelBooking(booking);
	}

	@Override
	public List<Hotel> listHotels() {
		return this.bookingDAO.listHotels();
	}

}
