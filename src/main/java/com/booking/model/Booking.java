package com.booking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;


@Entity
@Table(name="BOOKING")
public class Booking implements Serializable{

	private static final long serialVersionUID = 4277339541889874853L;

	@Id
	@Column(name="BOOKING_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookingId;
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customerName="
				+ customerName + ", city=" + city + ", hotelName=" + hotelName
				+ ", checkinDate=" + checkinDate + ", checkoutDate="
				+ checkoutDate + ", roomsBooked=" + roomsBooked + "]";
	}

	@NotNull
    @Size(min=2, max=30)
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	
	@NotNull
    @Size(min=2, max=20)
	@Column(name="CITY")
	private String city;
	
	@NotNull
    @Size(min=2, max=50)
	@Column(name="HOTEL_NAME")
	private String hotelName;
	
	@NotNull
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@Column(name="CHECKIN_DATE")
	private Date checkinDate;
	
	@NotNull
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@Column(name="CHECKOUT_DATE")
	private Date checkoutDate;
	
	@NotNull
	@NumberFormat(style = Style.NUMBER) @Min(1)
	@Column(name="ROOMS")
	private int roomsBooked;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Date getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		this.checkinDate = checkinDate;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public int getRoomsBooked() {
		return roomsBooked;
	}

	public void setRoomsBooked(int roomsBooked) {
		this.roomsBooked = roomsBooked;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
}
