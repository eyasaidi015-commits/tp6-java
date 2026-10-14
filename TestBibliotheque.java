public class TestBibliotheque {
    public static void main(String[] args) {
        Bibliotheque bib = new Bibliotheque(10);
        bib.Ajout_doc(new Livre("Java pour les nuls", 5, 400, "Jean Dupont", "Eyrolles"));
        bib.Ajout_doc(new document("Rapport de stage", 2, 50));
        bib.Ajout_doc(new Article("Les objets en Java", 8, 12, "Marie Curie"));
        bib.Ajout_doc(new Periodique("Science et Vie", 1, 120, "Mensuelle"));
        bib.Ajout_doc(new Livre("Algorithmique", 3, 650, "Thomas Cormen", "Dunod"));
        bib.Ajout_doc(new Article("Heritage et polymorphisme", 6, 20, "Alan Turing"));

        System.out.println("Inventaire complet");
        bib.Inventaire_doc();

        System.out.println("\n Liste des livres");
        bib.liste_livre().Inventaire_doc();

        System.out.println("\n Liste des articles");
        bib.liste_article().Inventaire_doc();

        System.out.println("\n Liste des documents simples");
        bib.liste_docsimples().Inventaire_doc();

        System.out.println("\n Liste des periodiques");
        bib.liste_periodique().Inventaire_doc();

        System.out.println("\n Suppression du document 5");
        bib.Supprim_doc(5);
        bib.Supprim_doc(99); 
        bib.Inventaire_doc();
        System.out.println("Nombre de documents : " + bib.getNombre_document());
        System.out.println("Capacite maximale : " + bib.getCapacite());
  
        Bibliotheque petite = new Bibliotheque(1);
        petite.Ajout_doc(new document("Doc A", 1, 10));
        petite.Ajout_doc(new document("Doc B", 2, 20));
    }
}