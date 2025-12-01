public class Patient extends Personne{

    public Patient(String NomPrenom, int Age, Sexe Sexe){
        super(NomPrenom, Age, Sexe);
    }

    void Afficher_Test(){
        System.out.println("PATIENT:");
        System.out.println("NOM COMPLET: "+ NomPrenom);
        System.out.println("Age : " + Integer.toString(Age));
        switch(Sexe){
            case MASCULIN:
                System.out.println("SEXE: Masculin");
                break;
            case FEMININ:
                System.out.println("SEXE: Feminin");
        }

    }
}
