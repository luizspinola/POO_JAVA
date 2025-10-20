import java.util.Scanner;
public class Etudiant {

    private String nom;
    private int age;
    private String filiere;
    private Boolean activite;
    public static int nbEtudiant = 0;
    private int identifiant;

    // Getter
    public String getName() {
        return nom;
    }

    // Setter
    public void setName(String newName) {
        this.nom = newName;
    }
    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int newAge) {
        this.age = newAge;
    }
    // Getter
    public String getFiliere() {
        return filiere;
    }

    // Setter
    public void setfiliere(String newFiliere) {
        this.filiere = newFiliere;
    }

    // Getter
    public Boolean getActivite(){
        return activite;
    }

    // Setter
    public void setActivite(Boolean newActivite) {
        this.activite = newActivite;
    }
  
    // Getter
    public int getIdentifiant() {
        return identifiant;
    }


    public Etudiant(String Nom, int Age, String Filiere, Boolean Activite){
        nom = Nom;
        age = Age;
        filiere = Filiere;
        Activite = activite;
        nbEtudiant++;
        identifiant = nbEtudiant;
    }

    public Etudiant(Boolean Activite){
        Scanner nome = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);
        Scanner filial = new Scanner(System.in);
        System.out.println("Quelle est votre nom?");
        nom = nome.nextLine();

        System.out.println("Quelle est votre age?");
        age = idade.nextInt();

        System.out.println("Quelle est votre filière?");
        filiere = filial.nextLine();
        activite = Activite;
        nbEtudiant++;
        identifiant = nbEtudiant;
    }

    public Etudiant(){
        Scanner nome = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);
        Scanner filial = new Scanner(System.in);
        System.out.println("Quelle est votre nom?");
        nom = nome.nextLine();

        System.out.println("Quelle est votre age?");
        age = idade.nextInt();

        System.out.println("Quelle est votre filière?");
        filiere = filial.nextLine();
        nbEtudiant++;
        identifiant = nbEtudiant;
    }

    public void afficher_etudiant(){
        System.out.println("");
        System.out.println("Nom: "+nom);
        System.out.println("Age: "+age);
        System.out.println("Filière: "+filiere);
        System.out.println("Active: "+activite);
    }
    public void reveiller(){
        if(activite){
            System.out.println("étudiant dejà reveillé");
        }else{
           System.out.println("Réveille-toi, "+nom+" !");
           activite = true; 
        }
    }
}