package com.example;

public class Calculator {
    public int multiply(int x, int y) {
        return x * y;
    }
    public double devide(int x, int y) {
        return (double)x / (double)y;
    }
    public int sum(int x, int y) {
        return x + y;
    }
    public int subtract(int x, int y) {
        return x - y;
    }
    public double calcTriangleArea(int bottom, int height) {
        double area = (double)(bottom * height) / 2;
        return area;
    }
}