public class Obstetricien extends Medecin{
    
    public Obstetricien(String nom, String hopital){
        super(nom, hopital);
    }

    public void AjouterPatient(Patient patient){
        if(patient instanceof FemmeEnceinte){
            super.AjouterPatient(patient);
            System.out.println("c'est bon");
        }else{
            System.out.println("La patient doit être une femme enceinte!");
        }
    }
}
