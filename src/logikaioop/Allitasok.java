package logikaioop;

public class Allitasok {
    private String[] allitasok;

    public Allitasok(String[] allitasok) {
        this.allitasok = allitasok;
    }

    public String[] getAllitasok() {
        return allitasok;
    }

    @Override
    public String toString() {
        return "Allitasok{" + "allitasok=" + allitasok + '}';
    }
}
