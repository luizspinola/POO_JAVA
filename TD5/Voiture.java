public class Voiture extends VehiculeARoues{

    public static final int nbRoues = 4;
    public static final int vitesseMaximale = 200;
    
    public Voiture(String couleur, int vitesseCourante,
                   Direction directionCourante, boolean etat)
        {
        super(couleur, nbRoues, vitesseCourante, directionCourante, etat, vitesseMaximale);
        }
}
