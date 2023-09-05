package com.example.demo.actors;

import jakarta.persistence.*;

@Entity
@Table(name = "Patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long Id;
    @Column(name = "last_name")
     private String last_name;
    @Column(name="first_name")
     private String first_name;

    @Column(name = "gender")
     private String gender;
    @Column(name = "email")
     private String email;


    public Patient(String last_name, String first_name, String gender, String email) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.gender = gender;
        this.email = email;
    }

    public Patient() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
