package logikaioop;

import java.util.Scanner;

public class Controller {

    private static final Scanner sc = new Scanner(System.in);
    private Lada[] tomb;

    public Controller() {
        tomb = new Lada[3];
        System.out.println("Leírás");
        tomb[0] = new Lada("arany", "Az 1.állítás", false);

        tomb[1] = new Lada("ezüst", "A 2.állítás", false);

        tomb[2] = new Lada("bronz", "A 3.állítás", true);

        for (Lada lada : tomb) {
            System.out.println(lada.getAllitas());
        }

        System.out.println("Melyik:");
        eredemeny();
       
    }

    private void eredemeny() {
        if(isHelyes(beker())){
        
            System.out.println("A válasz jó");
        }
        else{
            System.out.println("A válasz rossz");
        }
    }

    public int beker() {
        return sc.nextInt()-1;
    }

    public boolean isHelyes(int szam) {
        return tomb[szam].isKincs();
    }
}
