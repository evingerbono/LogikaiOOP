package model;

public class LadaModel {
    
    private final Lada[] ladak;
    
    public LadaModel(Lada[] ladak) {
        this.ladak = ladak;
    }
    
    public Lada getLada(int index) {
        return ladak[index];
    }
    
    public int getLadakLenght() {
        return ladak.length;
    }
    
    public boolean isHelyes(int szam) {
        return ladak[szam].isKincs();
    }
}
