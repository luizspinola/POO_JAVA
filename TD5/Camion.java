public class Camion extends VehiculeARoues{

    public static final int vitesseMaximale = 100;
    
    public Camion(String couleur, int nbRoues, int vitesseCourante,
                   Direction directionCourante, boolean etat)
                   throws VitesseExcessive, NbRouesImpossible
        {
        super(couleur, nbRoues, vitesseCourante, directionCourante, etat, vitesseMaximale);
        if(vitesseCourante > vitesseMaximale){
                throw new VitesseExcessive();
            }
            else if(!(nbRoues == 4 || nbRoues == 6 || nbRoues == 8)){
                throw new NbRouesImpossible();
            }
        }

        public void afficher(){
            System.out.println("Camion : " + this.couleur + ", " + this.vitesseCourante + " km/h, " + this.directionCourante.nom + ", " + this.etat + ", " + this.nbRoues + " roues.");
        }

}
