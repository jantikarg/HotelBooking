package com.booking.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.booking.model.Booking;
import com.booking.model.Hotel;

@Repository
public class BookingDAOImpl implements BookingDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(BookingDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	 
	@Override
	public void addHotelBooking(Booking booking) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(booking);
		logger.info("Booking saved successfully, Booking Details="+booking);
	}

	@Override
	public void updateHotelBooking(Booking booking) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(booking);
		logger.info("Booking updated successfully, Booking Details="+booking);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hotel> listHotels() {
		Session session = this.sessionFactory.getCurrentSession();
		//List<Hotel> hotelList = session.createQuery("from Hotel").list();
		List<Hotel> hotelList = session.createQuery("FROM Hotel ORDER BY tariff asc").setMaxResults(5).list();
		for(Hotel hotel : hotelList){
			logger.info("HOtel List::"+hotel);
		}
		return hotelList;
	}	
}
