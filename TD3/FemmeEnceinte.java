import java.util.Scanner;

public class FemmeEnceinte  extends Patient{
    private Boolean chambreReserve;
    private Boolean accouche;
    private String dateBebe;

    public FemmeEnceinte(){
        super();
        Scanner input = new Scanner(System.in);
        System.out.print("Vous Avez Reserve une chambre?: ");
        this.chambreReserve = input.nextBoolean();
        System.out.println("");
        System.out.print("Vous Avez accouché?: ");
        this.accouche = input.nextBoolean();
        System.out.println("");
    }

    // Getter
    public String getDate() {
        return this.dateNaissance;
    }

    // Setter
    public void setDate(String newDate) {
        this.dateNaissance = newDate;
    }

    // Getter
    public boolean getChambre() {
        return this.chambreReserve;
    }

    // Setter
    public void setChambre(Boolean newChambre) {
        this.chambreReserve = newChambre;
    }

    // Getter
    public String getDateBebe() {
        return this.dateBebe;
    }

    // Setter
    public void setdateBebe(String newdateBebe) {
        this.dateBebe = newdateBebe;
    }
    
    // Getter
    public Boolean getAccouche() {
        return this.accouche;
    }

    // Setter
    public void setAccouche(Boolean newAccouche) {
        this.accouche = newAccouche;
    }

    public String toString(){
        return this.nom + " " + this.prenom + " " + this.dateNaissance + " " + this.chambreReserve.toString() + " " + this.dateBebe;
    }
}
