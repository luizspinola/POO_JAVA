public class Medecin extends Personne{

    public static final int nb_patiants_max;
    Hopital Hopital;
    String NomPrenom;
    int Age;
    Sexe Sexe;

    public Medecin(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe);
        this.Hopital = Hopital; 

    }


}
