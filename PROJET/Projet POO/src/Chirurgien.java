public class Chirurgien extends Medecin{
    public int nb_patiants_max;
    Hopital Hopital;
    String NomPrenom;
    int Age;
    Sexe Sexe;

    public Chirurgien(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe, Hopital);
    }

    
}

