package tp02_2;

public class Person {
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private short age;

    public Person(String nom, String prenom, String email, String tel, short age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel +'\'' +
                ", age='" + age+ '\'';
    }
}
