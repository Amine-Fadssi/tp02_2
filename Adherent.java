package tp02_2;

public class Adherent extends Person {
    private int numAdherent;

    public Adherent(String nom, String prenom, String email, String tel, short age, int numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", num Adherent=" + numAdherent+ '\'';
    }
}
