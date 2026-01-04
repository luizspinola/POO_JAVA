public class ChirurgienOrthopedique extends Chirurgien{
    public ChirurgienOrthopedique(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe, Hopital);
    }

    @Override
    public void operer(Patient Patient){
        Hopital.addSalle(Patient, Salle.BLOC_OPERATOIRE);
        System.out.println("Operation commencé");
    }

    @Override
    public void amputer(Patient Patient, int numberLimb){
        anesthesier(Patient);
        switch(numberLimb){
            case 1:
                System.out.println("Bras droit amputé");
                System.out.println("Prothèse ajouté");
                break;
            case 2:
                System.out.println("Bras gauche amputé");
                System.out.println("Prothèse ajouté");
                break;
            case 3:
                System.out.println("Jambe droite amputé");
                System.out.println("Prothèse ajouté");
                break;
            case 4:
                System.out.println("Jambe gauche amputé");
                System.out.println("Prothèse ajouté");
                break;
        }
        Hopital.addSalle(Patient, Salle.SALLE_DE_REVEIL);
    }
    
}
