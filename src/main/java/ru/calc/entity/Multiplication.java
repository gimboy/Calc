package ru.calc.model;

public class Multiplication implements Operation{
    @Override
    public double calculation(double a, double b) {
        return a*b;
    }
}