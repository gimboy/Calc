package ru.calc.entity;

import ru.calc.entity.Operation;

public class Subtraction implements Operation {
    @Override
    public double calculation(double a, double b) {
        return a-b;
    }
}
