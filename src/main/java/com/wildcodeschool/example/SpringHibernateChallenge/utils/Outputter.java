package com.wildcodeschool.example.SpringHibernateChallenge.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.example.SpringHibernateChallenge.entities.Vehicle;
import com.wildcodeschool.example.SpringHibernateChallenge.repositories.UserDao;

@Component
public class Outputter implements CommandLineRunner {

	private Logger LOG = LoggerFactory.getLogger("Vehicle");

    @Autowired
    private UserDao userDao;

    @Override
    public void run(String... args) throws Exception {

        LOG.info("**********************");
       
        Vehicle vehicle1 = new Vehicle("Train", "SNCF", 228);
        LOG.info("******************");
        LOG.info(vehicle1.getBrand() + " has been created !");
        userDao.save(vehicle1);
        LOG.info(vehicle1.getBrand() + " has been saved !");
        
        Vehicle vehicle2 = new Vehicle("vélo à roulettes", "décathlon", 4);
        LOG.info("******************");
        LOG.info(vehicle2.getBrand() + " has been created !");
        userDao.save(vehicle2);
        LOG.info(vehicle2.getBrand() + " has been saved !");
        
        Vehicle vehicle3 = new Vehicle("Airbus", "A380", 43);
        LOG.info("******************");
        LOG.info(vehicle3.getBrand() + " has been created !");
        userDao.save(vehicle3);
        LOG.info(vehicle3.getBrand() + " has been saved !");
        
        Vehicle vehicle4 = new Vehicle("Ford", "Fiesta", 4);
        LOG.info("******************");
        LOG.info(vehicle4.getBrand() + " has been created !");
        userDao.save(vehicle4);
        LOG.info(vehicle4.getBrand() + " has been saved !");
        
        LOG.info("******************");
        LOG.info("Vehicles in list are ");
        for(Vehicle myVehicle : userDao.findAll()) {
            LOG.info(myVehicle.toString());
        };
        userDao.deleteById(2L);
        
        LOG.info("******************");
        LOG.info("Vehicles in list are ");
        for(Vehicle myVehicle : userDao.findAll()) {
            LOG.info(myVehicle.toString());
        };
        
        LOG.info("******************");
        LOG.info("Objects in DB : " + userDao.count());   
    }
}
