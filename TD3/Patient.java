import java.util.Scanner;
public class Patient {
    protected final String nom;
    protected final String prenom;
    protected String dateNaissance;
    public static int nb_patients = 0;

    public Patient(){
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nom: ");
        this.nom = input.nextLine();
        System.out.println("");
        System.out.print("Entrez un prenom: ");
        this.prenom = input.nextLine();
        System.out.println("");
        System.out.print("Entrez une date de naissance (JJMMAAAA): ");
        this.dateNaissance = input.nextLine();
        System.out.println("");
        nb_patients++;
    }

    public Patient(String nom, String prenom, String dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        nb_patients++;
    }

    public String toString(){
        return this.nom + " " + this.prenom + " " + this.dateNaissance;
    }
    
    public void afficher(){
        System.out.println(toString());
    }

    public boolean equals(Patient otherPatient){
        if(toString().equals(otherPatient.toString())){
            return true;
        }else{
            return false;
        }
    }
}
