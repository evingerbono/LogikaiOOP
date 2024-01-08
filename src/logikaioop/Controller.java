package logikaioop;

import java.util.Scanner;

public class Controller {

    public Controller() {

        System.out.println("Leírás");
        Lada l1= new Lada("arany", "Az 1.állítás", true);
        System.out.println(l1.getAllitas());
        Lada l2= new Lada("ezüst", "A 2.állítás", true);
        System.out.println(l2.getAllitas());
        Lada l3= new Lada("bronz", "A 3.állítás", true);
        System.out.println(l3.getAllitas());
        System.out.println("Melyik:");
        Beker();
        System.out.println("A válasz jó | rossz");
    }

    public void Beker() {
        Scanner sc = new Scanner(System.in);
        String valasz;
        valasz = sc.next();
    }
}
