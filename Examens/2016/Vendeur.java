public class Vendeur extends Commerciale {
    
    public Vendeur(String nom, String prenom, int anneesEntreprise, double chiffAff){
        super(nom, prenom, anneesEntreprise, chiffAff, 500, 0.15);
    }

    public String toString(){
        return("Vendeur" + " — " + super.toString());
    }



}
