public abstract class Employe{

    public String nom;
    public String prenom;
    public int anneesEntreprise;

    public Employe(String nom, String prenom, int anneesEntreprise){
        this.nom = nom;
        this.prenom = prenom;
        this.anneesEntreprise = anneesEntreprise;
    }

    public abstract double calculerSalaire();

    public String toString(){
        return(prenom + " " + nom);
    }

    public String compareAncien(Employe autreEmploye){
        if(anneesEntreprise > autreEmploye.anneesEntreprise){
            return(nom);
        } else if(anneesEntreprise > autreEmploye.anneesEntreprise){
            return(autreEmploye.nom);
        } else {
            return("Les deux ont le même ancienneté");
        }
    }

}