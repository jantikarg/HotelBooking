package com.booking.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.booking.dao.BookingDAOImpl;
import com.booking.model.Booking;
import com.booking.model.Hotel;
import com.booking.service.BookingService;

@Controller
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	private static final Logger logger = LoggerFactory.getLogger(BookingDAOImpl.class);
    
    @RequestMapping(BookingConstants.HEALTH_CHECK)
    public String healthCheck() {
        return "Hotel Booking Spring Boot App is Up and Running!";
    }
    
    /**
     * GET  /  -> show the index page.
     */
    @RequestMapping("/")
    public String index() {
      return "index";
    }
    
    /**
     * GET  /  -> show the booking page.
     */
    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public ModelAndView booking(ModelMap model) {
      //model.addAttribute("login", new Booking()); 
    	return new ModelAndView("booking", "book", new Booking()); 
    }
    
    @RequestMapping(value = BookingConstants.BOOK_A_ROOM, method = RequestMethod.POST)
    public String bookRoom(@ModelAttribute("book") @Valid Booking form, BindingResult result,
    		@RequestParam(required=false , value = "submit") String submitFlag,
    		@RequestParam(required=false , value = "cancel") String cancelFlag,
    		RedirectAttributes redirectAttributes) {
        logger.debug("Received request to save {}, with result={}", form, result);
        if(cancelFlag != null){
        	return "index";
        }
        else if(submitFlag !=null){
        	
	        if (result.hasErrors()) {
	            return "booking";
	        }
	        try {
	        	bookingService.addHotelBooking(form);
	        	redirectAttributes.addFlashAttribute("SUCCESS_MESSAGE", "Booking Confirmed!!!");
	        } catch (Exception e) {
	            logger.debug("Tried to save booking with existing id", e);
	            result.reject("Failed to save");
	            return "index";
	        }
        }
        return "booking";
    }
    
    /*@RequestMapping(value = BookingConstants.LOWEST_PRICED_HOTELS,
    method = RequestMethod.GET)
    public @ResponseBody List<Hotel> viewLowestPricedHotels() {
    	List<Hotel> hotelList = bookingService.listHotels();
        return hotelList;//bookingService.listHotels();
    }*/
    
    @RequestMapping(value = BookingConstants.LOWEST_PRICED_HOTELS,
    	    method = RequestMethod.GET,
    	    produces = MediaType.APPLICATION_JSON_VALUE)
    public String viewLowestPricedHotels(Model model) {
    	List<Hotel> entities = new ArrayList<Hotel>();
    	List<Hotel> hotelList = bookingService.listHotels();
    	for(Hotel hotel: hotelList){
    		logger.info("Hotel::"+hotel);
    		entities.add(hotel);
    	}
    	model.addAttribute("hotellist",entities);
        return "lowestpricedhotel";
    }
    
}
