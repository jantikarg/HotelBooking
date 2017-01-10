/*package com.booking.controller;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BookingControllerTest {

    @Autowired
    private MockMvc mvc;
    
    @Autowired
	private SessionFactory sessionFactory;

    @Test
    public void getHealthCheck() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/healthcheck").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hotel Booking Spring Boot App is Up and Running!")));
    }
    
    @Test
    public void viewLowestPricedHotelsTest(){
    	
    }
    
    @Test
    public void addSampleData(){
    	
    	Session session = this.sessionFactory.getCurrentSession();
    	
    	Hotel hotel1 = new Hotel();
    	hotel1.setName("Hotel Test");
    	hotel1.setCity("Gainesville");
    	hotel1.setNumberOfRooms(20);
    	hotel1.setStarRating(4);
    	
    	Hotel hotel2 = new Hotel();
    	hotel2.setName("Hotel2 Test");
    	hotel2.setCity("New York");
    	hotel2.setNumberOfRooms(50);
    	hotel2.setStarRating(5);
    	
    	session.save(hotel1);
    	session.save(hotel2);
    }
}
*/