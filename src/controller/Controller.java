package controller;

import model.Lada;
import model.LadaModel;
import view.LadaView;

public class Controller {

    private final LadaModel model;
    private final LadaView view;

    public Controller() {
        model = new LadaModel(new Lada[] {
            new Lada("arany", "Én rejtem a kincset!", false),
            new Lada("ezüst", "Nem én rejtem a kincset!", true),
            new Lada("bronz", "Az arany hazudik!", false)
        });
        view = new LadaView();
        String s = "";
        for (int i = 0; i < model.getLadakLenght(); i++) {
            s += i + 1 + ": " + model.getLada(i).getAllitas() + "\n";
        }
        view.kiir("A válasz " + (model.isHelyes(view.beker(s + "Melyik: ")) ? "jó" : "rossz"));
    }
}
