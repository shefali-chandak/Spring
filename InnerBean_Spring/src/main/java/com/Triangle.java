package com;

//Triangle has 3 points/corners and total 6 coordinates
public class Triangle
{
    private Point point1;
    private Point point2;
    private Point point3;

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    @Override
    public String toString() {
        return "****** Triangle Coordinates ******** " +
                "\npoint1=" + getPoint1().toString() +
                ",\npoint2=" + getPoint2().toString() +
                ",\npoint3=" + getPoint3().toString() ;
    }
}
