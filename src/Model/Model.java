package Model;

import java.util.Scanner;

public class Model {

    private Lada[] tomb;
    private static final Scanner sc = new Scanner(System.in);

    public Model() {
        tomb = new Lada[3];
    }

    public String getAllitas(int index) {
        return tomb[index].getAllitas();
    }

    public boolean isHelyes(int szam) {
        return tomb[szam].isKincs();
    }

    public int beker() {
        int szam = 0;
        while (szam < 1 || szam > 3) {
            szam = sc.nextInt();
        };
        return szam - 1;
    }
    
    public Lada[] getTomb() {
        return tomb;
    }
}

