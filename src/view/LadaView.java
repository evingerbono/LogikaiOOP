package view;

import java.util.Scanner;

public class LadaView implements View {

    private static final Scanner sc = new Scanner(System.in);
    
    public LadaView() {
        
    }
    
    @Override
    public void kiir(String szoveg) {
        System.out.println(szoveg);
    }

    @Override
    public int beker() {
        int szam = 0;
        while (szam < 1 || szam > 3) {
            szam = sc.nextInt();
        }
        return szam - 1;
    }
}
