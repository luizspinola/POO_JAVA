public abstract class Produit{
    
    public double prixRegulier;
    public static int nbrProduit;

    public Produit(double prixRegulier){
        this.prixRegulier = prixRegulier;
        nbrProduit++;
    }

    public abstract double calculPrixVente();
    publiv abstract double 
}