package tp02_2;

public class Auteur extends Person{
    private int numAuteur;

    public Auteur(String nom, String prenom, String email, String tel, short age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", num Auteur='" + numAuteur+ '\'';
    }
}
