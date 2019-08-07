package com.example.springCarStore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String make;
    private String model;
    private Integer year;

    private Car(){

    }

    public Car(String make, String model,Integer year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Long getId(){return Id;}

    public String getMake() {return make;}
    public void setMake(String make) {this.make = make;}

    public String getModel(){return model;}
    public void setModel(String model){this.model = model;}

    public Integer getYear(){return year;}
    public void setYear(Integer year){this.year = year;}

    @Override
    public String toString() {
        return "Car{" +
                "Id=" + Id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
