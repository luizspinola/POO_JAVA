public class Camion extends VehiculeARoues{

    public static final int vitesseMaximale = 88;
    
    public Camion(String couleur, int nbRoues, int vitesseCourante,
                   Direction directionCourante, boolean etat)
        {
        super(couleur, nbRoues, vitesseCourante, directionCourante, etat, vitesseMaximale);
        }

}
