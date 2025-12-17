public class Production extends Employe {
    
    public int unites;
    public static final int facteurMult = 5;

    public Production(String nom, String prenom, 
                       int anneesEntreprise, int unites)throws UniteException{
            super(nom, prenom, anneesEntreprise);
            if(unites <=0){throw new UniteException();}
            this.unites = unites;
    }

    public double calculerSalaire(){
        return(unites*facteurMult);
    }

}
