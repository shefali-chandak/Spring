package com;

public class Participants {
    private String name,address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Participants{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
