package logikaioop;

import java.util.Arrays;

public class Allitasok {

    private String[] tomb;

    public Allitasok(String[] tomb) {
        this.tomb = tomb;
    }

    public String[] getTomb() {
        return tomb;
    }

    public void setTomb(String[] tomb) {
        this.tomb = tomb;
    }

    @Override
    public String toString() {
        return "Allitasok{" + "tomb=" + tomb + '}';
    }

}
