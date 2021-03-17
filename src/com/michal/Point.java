package com.michal;

public class Point {

    private int x;
    private int y;

    public Point(){
        //System.out.println("Empty Constructor");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double pointX = 0.0;
        double pointY = 0.0;

        return Math.sqrt(Math.pow((pointX - getX()),2)+Math.pow((pointY - getY()),2));
    }

    public double distance(int pointX,int pointY){

        return Math.sqrt(Math.pow((pointX - getX()),2)+Math.pow((pointY - getY()),2));
    }
    public double distance(Point oder){

        return Math.sqrt(Math.pow((oder.x- getX()),2)+Math.pow((oder.y - getY()),2));
    }
}
