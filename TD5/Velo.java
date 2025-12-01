public class Velo extends VehiculeARoues{
    
    public static final int nbRouesMaximale = 2;
    public static final int vitesseMaximale = 40;
    
    public Velo(String couleur, int vitesseCourante,
                   Direction directionCourante, boolean etat,
                int nbRoues) throws VitesseExcessive, NbRouesImpossible
        {
            super(couleur, nbRoues, vitesseCourante, directionCourante, etat, vitesseMaximale);
            if(vitesseCourante > vitesseMaximale || vitesseCourante < 0){
                throw new VitesseExcessive();
            }
            else if(nbRoues != nbRouesMaximale){
                throw new NbRouesImpossible();
            }
            
        }
}
