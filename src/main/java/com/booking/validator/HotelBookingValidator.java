package com.booking.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.booking.model.Booking;

@Component
public class HotelBookingValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Booking.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    	Booking b = (Booking) target;
        if (b.getCheckinDate().after(b.getCheckoutDate())) {
        	errors.rejectValue("checkinDate", "Checkin Date has to be lesser than Checkout Date");
        } 
    }
}
