package com;

public class Circle {
    private float radius;
    private Point point;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        System.out.println("******* CIRCLE POINT ********");
        return "Circle : "+
                "\nradius=" + radius +
                ",\ncenter=" + getPoint().toString();
    }
}
