package tp02_2;

public class App {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Mustapha","Ibrahim",
                "ibrahim@gmail.com","061234512",
                (short) 25,255);
        Auteur auteur = new Auteur("Ahmed","sayd",
                "sayed@gmail.com","061200579",
                (short) 25,255);
        Livre livre = new Livre(3230,"islamic revolution",auteur);
        System.out.println("Adherent : "+adherent);
        System.out.println("Livre : "+livre);
    }
}
