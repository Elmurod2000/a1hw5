package com.example.a1hw5;

public class Model {
    private int image;
    private String country;
    private String city;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Model(int image, String country, String city, int id) {
        this.image = image;
        this.country = country;
        this.city = city;
        this.id = id;
    }

    public Model(int image, String country, String city) {
        this.image = image;
        this.country = country;
        this.city = city;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
