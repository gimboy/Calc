package ru.calc.view;

public class ViewConsole implements View {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
