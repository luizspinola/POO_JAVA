import java.util.Hashtable;
public abstract class Medecin extends Personne implements Operer{
    Hopital Hopital;
    protected Hashtable<String, Integer> patient_tab = new Hashtable<>();
    public int nb_patients_max;

    public Medecin(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe);
        this.Hopital = Hopital;

    }

        public void ajouterPatient(Patient Patient) throws NbPatientsImpossible{
        if(patient_tab.size() == nb_patients_max+1){
            throw new NbPatientsImpossible();
        }
        else{
            try{patient_tab.put(Patient.NomPrenom, Hopital.roomSelect(Patient));}
            catch(HopitalComplet e){System.out.println(e);}

        } 
    }

    public void suprimmerPatient(Patient Patient){
        Hopital.openRoom(patient_tab.get(Patient.NomPrenom));
        patient_tab.remove(Patient.NomPrenom);
    }

    public void rendreVisite(Patient Patient) throws NotMyPatient{
        if(patient_tab.containsKey(Patient.NomPrenom)){
            System.out.println("Patient visité!");
        }
        else{
            throw new NotMyPatient();
        }
    }

    @Override
    public void anesthesier(Patient Patient){
        if(Patient.Allergique == Boolean.TRUE){
            System.out.println("Produit B utilisé");
        }

        System.out.println("Produit A utilisé");
    }

    @Override
    public void operer(Patient Patient){
        Hopital.addSalle(Patient, Salle.BLOC_OPERATOIRE);
    }

    @Override
    public void amputer(Patient Patient, int numberLimb){}



}
