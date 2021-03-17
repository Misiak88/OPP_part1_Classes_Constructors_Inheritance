package com.michal;

public class Wall {

    private double width;
    private double height;

    public Wall(){
        System.out.println("Empty constructor");
    }

    public Wall(double width, double height) {

        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        this.height = height < 0 ? 0 : height;
    }

    public double getArea(){
        return this.width * this.height;
    }

}
