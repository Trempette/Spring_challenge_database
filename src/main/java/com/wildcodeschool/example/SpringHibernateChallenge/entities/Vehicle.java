package com.wildcodeschool.example.SpringHibernateChallenge.entities;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.wildcodeschool.example.SpringHibernateChallenge.repositories.UserDao;

@Entity
public class Vehicle{

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int nbRoues) {
        this.brand = brand;
        this.model = model;
        this.nbRoues = nbRoues;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String brand;

    private String model;

    private int nbRoues;

    @Override
    public String toString() { 
        return "Vehicle : [id=" + id + ", Brand=" + brand + 
                ", Model=" + model + ", Wheels number=" + nbRoues + "]";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNbRoues() {
		return nbRoues;
	}

	public void setNbRoues(int nbRoues) {
		this.nbRoues = nbRoues;
	}             

}
