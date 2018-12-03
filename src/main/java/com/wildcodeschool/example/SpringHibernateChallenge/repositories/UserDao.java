package com.wildcodeschool.example.SpringHibernateChallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.example.SpringHibernateChallenge.entities.Vehicle;

@Repository
public interface UserDao extends JpaRepository<Vehicle, Long> {

}
