package com.booking.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

import com.booking.model.Booking;
import com.booking.model.Hotel;

@Configuration        
public class HibernateConfig {

    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory(EntityManagerFactory emf) {
         HibernateJpaSessionFactoryBean factory = new HibernateJpaSessionFactoryBean();
         LocalSessionFactoryBean localSessionFactory = new LocalSessionFactoryBean();
         
         factory.setEntityManagerFactory(emf);
         localSessionFactory.setAnnotatedClasses(Hotel.class,Booking.class);
         return factory;
    }
}