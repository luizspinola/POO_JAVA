public class Velo extends VehiculeARoues{
    
    public static final int nbRoues = 2;
    public static final int vitesseMaximale = 25;
    
    public Velo(String couleur, int vitesseCourante,
                   Direction directionCourante, boolean etat)
        {
        super(couleur, nbRoues, vitesseCourante, directionCourante, etat, vitesseMaximale);
        }
}
