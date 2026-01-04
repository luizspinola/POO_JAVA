import java.util.Hashtable;
import java.util.Map;
public class Hopital {
    public final String Nom;
    protected Hashtable<Integer, Medecin> medecinTableau = new Hashtable<>();
    public final int nbChambre;
    protected Hashtable<Integer, Chambre> chambreTableau = new Hashtable<>();
    protected Hashtable<Integer, Patient> patientTableau = new Hashtable<>();
    protected Hashtable<Integer, Salle> salleTableau = new Hashtable<>();
    private int medecinIndex = 0;


    public Hopital(String Nom, int nbChambre) {
        this.Nom = Nom;
        this.nbChambre = nbChambre;

        for (int i = 1; i <= nbChambre; i++) {
            chambreTableau.put(i, Chambre.DISPONIBLE);
        }
    }

    public int roomSelect(Patient Patient) throws HopitalComplet {
        for (Map.Entry<Integer, Chambre> entre : chambreTableau.entrySet()) {
            if (entre.getValue() == Chambre.DISPONIBLE) {
                entre.setValue(Chambre.OCCUPE);
                patientTableau.put(entre.getKey(), Patient);
                return entre.getKey();
            }
        }
        throw new HopitalComplet();
    }

    public void openRoom(int roomNumber) {
        chambreTableau.put(roomNumber, Chambre.DISPONIBLE);
        patientTableau.remove(roomNumber);
    }

    public void addMedecin(Medecin Medecin) {
        medecinIndex++;
        medecinTableau.put(medecinIndex, Medecin);
    }

    public void afficherListe() {
        for (Map.Entry<Integer, Patient> patientEntry : patientTableau.entrySet()) {
            System.out.println("Patient: " + patientEntry.getValue().NomPrenom + ", Chambre: " + patientEntry.getKey().toString());
            System.out.println("--------------------------------------------------------");
        }
    }

    public void addSalle(Patient Patient, Salle Salle) {
        switch (Salle) {
            case SALLE_DE_REVEIL:
                salleTableau.put(getRoomNumber(Patient), Salle.SALLE_DE_REVEIL);
                break;
            case BLOC_OPERATOIRE:
                salleTableau.put(getRoomNumber(Patient), Salle.BLOC_OPERATOIRE);
                break;
            case SALLE_DE_TRAVAIL:
                salleTableau.put(getRoomNumber(Patient), Salle.SALLE_DE_TRAVAIL);
                break;
        }
    }

    public Integer getRoomNumber(Patient Patient) {
        for (Map.Entry<Integer, Patient> patientEntry : patientTableau.entrySet()) {
            if (patientEntry.getValue().equals(Patient)) {
                return patientEntry.getKey();
            }
        }
        return null;
    }

    public void afficherSalle(){
        for (Map.Entry<Integer, Patient> patientEntry : patientTableau.entrySet()) {
            System.out.print("Patient: " + patientEntry.getValue().NomPrenom);
            switch(salleTableau.get(patientEntry.getKey())){
                case SALLE_DE_REVEIL:
                    System.out.println(" Salle: Salle de Réveil");
                    System.out.println("--------------------------------------------------------");
                    break;
                case SALLE_DE_TRAVAIL:
                    System.out.println(" Salle: Salle de Travail");
                    System.out.println("--------------------------------------------------------");
                    break;
                case BLOC_OPERATOIRE:
                    System.out.println(" Salle: Bloc Opératoire");
                    System.out.println("--------------------------------------------------------");
                    break;
            }

        }
    }

    public void afficherNombre(){
        System.out.println(salleTableau.size()+" Patients présents dans l’hôpital, en salle de réveil, en salle de travail et au bloc opératoire.");
    }

}
