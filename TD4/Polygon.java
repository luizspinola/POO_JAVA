public abstract class Polygon implements Form{

    public int nb_cote;
    public double[] taille_cote;

    public double perimetre(){
        double perimetre = 0;
        for(int i = 0; i < taille_cote.length; i++){
            perimetre = perimetre + taille_cote[i];
        }
        return perimetre;
    }
}
