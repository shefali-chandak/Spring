package com;

public class Address {
    private String area;
    private String city;
    private String state;
    private String country;

    public Address(String area, String city, String state, String country) {
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
