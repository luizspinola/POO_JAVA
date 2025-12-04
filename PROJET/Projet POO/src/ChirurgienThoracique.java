public class ChirurgienThoracique extends Chirurgien{
    public static final int nb_patiants_max = 4;
    Hopital Hopital;
    String NomPrenom;
    int Age;
    Sexe Sexe;

    public ChirurgienThoracique(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe, Hopital);
    }
}
