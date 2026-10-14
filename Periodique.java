public class Periodique extends document {
    private String frequence;
    public Periodique(String titre, int numero, int nbPages, String frequence) {
        super(titre, numero, nbPages);
        this.frequence = frequence;
    }
    public String getFrequence() {
        return frequence;
    }
    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }
    public String getType() {
        return "Periodique";
    }
    public void edition() {
        super.edition();
        System.out.println("  Frequence de parution : " + frequence);
    }
}