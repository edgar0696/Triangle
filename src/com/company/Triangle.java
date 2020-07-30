package com.company;

public class Triangle {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(float a, float b, double gamma) {
        this.a = a;
        this.b = b;
        this.c = (float) Math.sqrt (a * a + b * b - 2 * a * b * Math.cos(gamma));
    }

    public Triangle() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +

                ", are=" + this.getArea() +
                ", Perimetr=" + this.getPerimetr() +
                '}';
    }

    public float getPerimetr(){
        return a + b + c;
    }
    public double getArea(){
        float p = this.getPerimetr() / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

}








