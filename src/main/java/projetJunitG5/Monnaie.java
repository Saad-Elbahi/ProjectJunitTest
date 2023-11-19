package projetJunitG5;

public class Monnaie {
	private int valeur;
    private String devise;

    public Monnaie(int valeur, String devise) {
        this.valeur = valeur;
        this.devise = devise;
    }

    public void ajouter(Monnaie autreMonnaie) {
        if (devise.equals(autreMonnaie.devise)) {
            valeur += autreMonnaie.valeur;
        }
    }

    public void retrancher(Monnaie autreMonnaie) {
        if (devise.equals(autreMonnaie.devise)) {
            valeur -= autreMonnaie.valeur;
        }
    }

    @Override
    public String toString() {
        return valeur + " " + devise;
    }

}
