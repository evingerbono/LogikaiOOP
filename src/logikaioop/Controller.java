package logikaioop;

import java.util.Scanner;

public class Controller {

    private static final Scanner sc = new Scanner(System.in);
    private Lada[] tomb;

    public Controller() {
        tomb = new Lada[3];
        System.out.println("Leírás");
        tomb[0] = new Lada("arany", "Én rejtem a kincset!", false);

        tomb[1] = new Lada("ezüst", "Nem én rejtem a kincset!", true);

        tomb[2] = new Lada("bronz", "Az arany hazudik!", false);

        for (Lada lada : tomb) {
            System.out.println(lada.getAllitas());
        }

        System.out.print("Melyik: ");
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
         int szam=0;
         while (szam < 1 || szam > 3){
             szam = sc.nextInt();
         };
        return szam - 1;
    }

    public boolean isHelyes(int szam) {
        return tomb[szam].isKincs();
    }
}
