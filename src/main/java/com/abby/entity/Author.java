package com.abby.entity;

public class Author {
    private String name;
    private String shorBiography;
    private int yearBorn;
    private String country;

    public Author(String name, String shorBiography, int yearBorn, String country) {
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
}
