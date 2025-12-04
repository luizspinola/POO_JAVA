public class Interniste extends Medecin{
    public static final int nb_patiants_max = 1;
    Hopital Hopital;
    String NomPrenom;
    int Age;
    Sexe Sexe;

    public Interniste(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe, Hopital);
    }
} 