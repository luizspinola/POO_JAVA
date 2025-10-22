public class Triangle extends Polygon{
    public final int nb_cote = 3;
    public double[] taille_cote;

    public Triangle(double[] taille_cote){
        this.taille_cote = taille_cote;
    }

    public double aire(){ //Heron Formula
        double s = perimetre()/2;
        return Math.sqrt((s)*(s - taille_cote[0])
                        *(s - taille_cote[1])*(s - taille_cote[2]));
    }
}
