package com;

import java.util.Set;

public class Director {
    private int id;
    private String  name;
    private Set<Movie> movie;

    public Director() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String  name) {
        this.name = name;
    }

    public Set<Movie> getMovie() {
        return movie;
    }

    public void setMovie(Set<Movie> movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", name=" + name +
                ", movie=" + movie +
                '}';
    }
}
