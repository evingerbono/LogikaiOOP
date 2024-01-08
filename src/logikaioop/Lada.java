package logikaioop;

public class Lada {

    private String anyag, allitas;
    private boolean kincs;

    public Lada(String anyag, String allitas, boolean kincs) {
        this.anyag = anyag;
        this.allitas = allitas;
        this.kincs = kincs;
    }

    public String getAnyag() {
        return anyag;
    }

    public void setAnyag(String anyag) {
        this.anyag = anyag;
    }

    public String getAllitas() {
        return allitas;
    }

    public void setAllitas(String allitas) {
        this.allitas = allitas;
    }

    public boolean isKincs() {
        return kincs;
    }

    public void setKincs(boolean kincs) {
        this.kincs = kincs;
    }
    
    @Override
    public String toString() {
        return "Lada{" + "anyag=" + anyag + ", allitas=" + allitas + ", kincs=" + kincs + '}';
    }
}
