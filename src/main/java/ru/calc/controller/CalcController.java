package ru.calc.controller;

import ru.calc.entity.Addition;
import ru.calc.entity.Multiplication;
import ru.calc.model.Model;
import ru.calc.view.ViewConsole;

public class CalcController {
    private Model model;



    public CalcController(Model model) {
        this.model = model;
    }


    private void calc() {
        model.getView().print(String.valueOf(model.getOperation().calculation(model.getA(), model.getB())));
    }

    public static void main(String[] args) {

        Model model = new Model(new Multiplication(), new ViewConsole(), 3,5);
        CalcController controller = new CalcController(model);
        controller.calc();
    }
}
