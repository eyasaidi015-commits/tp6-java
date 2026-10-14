public class Bibliotheque {
    private document[] listdoc;
    private int nombreDocuments;
    private int capacite;

    public Bibliotheque(int capacite) {
        this.capacite = capacite;
        this.listdoc = new document[capacite];
        this.nombreDocuments = 0;
    }
    public int getCapacite() {
        return capacite;
    }

    public int getNombre_document() {
        return nombreDocuments;
    }

    public void Ajout_doc(document d) {
        if (nombreDocuments >= capacite) {
            System.out.println("Bibliotheque pleine : impossible d'ajouter le document " + d.getNumero());
            return;
        }

        int pos = 0;
        while (pos < nombreDocuments && listdoc[pos].getNumero() < d.getNumero()) {
            pos++;
        }

        for (int i = nombreDocuments; i > pos; i--) {
            listdoc[i] = listdoc[i - 1];
        }
        listdoc[pos] = d;
        nombreDocuments++;
    }

    public void Supprim_doc(int num) {
        int pos = -1;
        for (int i = 0; i < nombreDocuments; i++) {
            if (listdoc[i].getNumero() == num) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Document " + num + " introuvable.");
            return;
        }
        for (int i = pos; i < nombreDocuments - 1; i++) {
            listdoc[i] = listdoc[i + 1];
        }
        listdoc[nombreDocuments - 1] = null;
        nombreDocuments--;
    }
    public void Inventaire_doc() {
        System.out.println("Inventaire (" + nombreDocuments + "/" + capacite + " documents)");
        for (int i = 0; i < nombreDocuments; i++) {
            listdoc[i].edition();
        }
    }
    private Bibliotheque filtrer(String type) {
        Bibliotheque res = new Bibliotheque(capacite);
        for (int i = 0; i < nombreDocuments; i++) {
            if (listdoc[i].getType().equals(type)) {
                res.Ajout_doc(listdoc[i]);
            }
        }
        return res;
    }
    public Bibliotheque liste_livre() {
        return filtrer("Livre");
    }
    public Bibliotheque liste_article() {
        return filtrer("Article");
    }
    public Bibliotheque liste_docsimples() {
        return filtrer("Document");
    }
    public Bibliotheque liste_periodique() {
        return filtrer("Periodique");
    }
}