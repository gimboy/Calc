package ru.calc.model;

import ru.calc.entity.Operation;
import ru.calc.view.View;

public class Model {
    private Operation operation;
    private View view;
    private double a;
    private double b;

    public Model(Operation operation, View view, double a, double b) {
        this.operation = operation;
        this.view = view;
        this.a = a;
        this.b = b;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
