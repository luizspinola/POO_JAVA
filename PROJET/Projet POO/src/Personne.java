public abstract class Personne {

    String NomPrenom;
    int Age;
    enum Sexe{MASCULIN, FEMININ};
    public static Sexe Sexe;

    public Personne (String NomPrenom, int Age, Sexe Sexe){
        this.NomPrenom = NomPrenom;
        this.Age = Age;
        this.Sexe = Sexe;
    }

}
