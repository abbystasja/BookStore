package com.abby.entity;

import javax.persistence.*;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String name;
    private String shorBiography;
    private int yearBorn;
    private String country;

    public Author(){}

    public Author(int id, String name, String shorBiography, int yearBorn, String country) {
        this.id = id;
        this.name = name;
        this.shorBiography = shorBiography;
        this.yearBorn = yearBorn;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShorBiography() {
        return shorBiography;
    }

    public void setShorBiography(String shorBiography) {
        this.shorBiography = shorBiography;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
