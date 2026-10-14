public class Article extends document {
    private String auteur;
    public Article(String titre, int numero, int nbPages, String auteur) {
        super(titre, numero, nbPages);
        this.auteur = auteur;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public String getType() {
        return "Article";
    }
    public void edition() {
        super.edition();
        System.out.println("  Auteur : " + auteur);
    }
}