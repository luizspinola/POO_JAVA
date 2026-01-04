public class Obstetricien extends Medecin{

    public Obstetricien(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe, Hopital);
        nb_patients_max = 4;
    }

    public void accouchement(Patient Patient){
        Hopital.addSalle(Patient, Salle.SALLE_DE_TRAVAIL);
        anesthesier(Patient);
        System.out.println("Césarienne fait");
        Hopital.addSalle(Patient, Salle.SALLE_DE_REVEIL);
    }
}
