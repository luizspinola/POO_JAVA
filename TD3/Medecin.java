import java.util.ArrayList;
public class Medecin {
    protected String nom;
    protected String hopital;
    protected ArrayList<Patient> patient_tab = new ArrayList<Patient>();
    protected int patient_number = 0;

    public Medecin(String nom, String hopital){
        this.nom = nom;
        this.hopital = hopital;
    }

    public Medecin(){
        this.nom = "Docteur";
        this.hopital = "HC-UFU";
    }

    public void AjouterPatient(Patient patient){
        if(patient_number <= 3){
            patient_tab.add(patient);
            patient_number++;
        }else{
            System.out.println("médecin avec maximum de patients!");
        }
    }

    public void RetirerPatient(Patient patient){
        if(patient_number >= 0){
            patient_tab.remove(patient);
            patient_number--;
        }else{
            System.out.println("médecin sans patients!");
        }
    }

    public void AfficherPatient(){
        for(int i = 0; i<=patient_number; i++){
            System.out.println(patient_tab.get(i));
        }
    }
}
