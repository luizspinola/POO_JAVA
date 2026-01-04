public class ChirurgienThoracique extends Chirurgien{
    public ChirurgienThoracique(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe, Hopital);
    }

    @Override
    public void operer(Patient Patient){
        System.out.println("Cage thoracique ouverte");

    }

}