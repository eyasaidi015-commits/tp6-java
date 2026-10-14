public class document {
    private String titre;
    private int numero;
    private int nbPages;
    public document() {
    }

    public document(String titre, int numero, int nbPages) {
        this.titre = titre;
        this.numero = numero;
        this.nbPages = nbPages;
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public String getType() {
        return "Document";
    }

    public void edition() {
        System.out.println("Type : " + getType());
        System.out.println("  Titre : " + titre);
        System.out.println("  Numero d'identification : " + numero);
        System.out.println("  Nombre de pages : " + nbPages);
    }
}