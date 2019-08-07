package com.example.practice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//lets springboot know that customer classes are an entity stored in a database. Also indicates that customer is a jpa entity.
@Entity
public class Customer {

    @Id//id is our primary-key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Auto-Generate values for the ID
    private Long Id;
    private String firstName;
    private String lastName;


    private Customer(){
        //@entity needs a no arg constructor
    }

    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId(){return Id;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}


    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
