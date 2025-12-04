public class ChirurgienOrthopedique extends Chirurgien{
    public int nb_patiants_max = 4;
    Hopital Hopital;
    String NomPrenom;
    int Age;
    Sexe Sexe;

    public ChirurgienOrthopedique(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe, Hopital);
    }
    
}
