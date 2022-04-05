package com;

public class Triangle
{
    private float base;
    private float height;
    private String type;

    public void setBase(float base) {
        this.base = base;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", type='" + type + '\'' +
                '}';
    }
    public void area(){
        float area = (float) (0.5 * height * base);
        System.out.println("Area of Triangle :: " + area);
    }
}
