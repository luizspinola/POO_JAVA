import java.util.Hashtable;
public class Medecin extends Personne{
    Hopital Hopital;
    String NomPrenom;
    int Age;
    Sexe Sexe;
    protected Hashtable<String, Integer> patient_tab = new Hashtable<>();
    public int nb_patiants_max;

    public Medecin(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe);
        this.Hopital = Hopital; 

    }

        public void ajouterPatient(Patient Patient) throws NbPatientsImpossible{
        if(patient_tab.size() == nb_patiants_max+1){
            throw new NbPatientsImpossible();
        }
        else{
            patient_tab.put(Patient.NomPrenom, Hopital.roomSelect());
        } 
    }

    public void suprimmerPatient(Patient Patient){
        Hopital.openRoom(patient_tab.get(Patient.NomPrenom));
        patient_tab.remove(Patient.NomPrenom);
    }


}
