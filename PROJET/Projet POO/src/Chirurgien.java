public class Chirurgien extends Medecin{
    public Chirurgien(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe, Hopital);
        nb_patients_max = 5;
    }
}

