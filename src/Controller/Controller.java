package Controller;

import Model.Model;

public class Controller {

    private Model model;

    public Controller() {
        model = new Model();
        eredmeny();
    }

    private void eredmeny() {
        for (int i = 0; i < model.getTomb().length; i++) {
            System.out.println(model.getAllitas(i));
        }

        System.out.print("Melyik: ");
        if (model.isHelyes(model.beker())) {
            System.out.println("A válasz jó");
        } else {
            System.out.println("A válasz rossz");
        }
    }
}
