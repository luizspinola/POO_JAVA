public abstract class Commerciale extends Employe{

    public double chiffAff;
    public int prime;
    public double pourcentage;

    public Commerciale(String nom, String prenom, 
                       int anneesEntreprise, double chiffAff, 
                       int prime, double pourcentage){
            super(nom, prenom, anneesEntreprise);
            this.chiffAff = chiffAff;
            this.prime = prime;
            this.pourcentage = pourcentage;
    }

    public double calculerSalaire(){
        return((pourcentage*chiffAff)+prime);
    }

    public String toString(){
        return("Commercial" + " — " + super.toString());
    }
        
}
