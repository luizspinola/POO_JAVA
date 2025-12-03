public abstract class VehiculeARoues implements Dirigeable{
    
    String couleur;
    int nbRoues;
    int vitesseCourante;
    Direction directionCourante;
    boolean etat;
    int vitesseMaximale;

    public VehiculeARoues(String couleur, int nbRoues, int vitesseCourante,
                          Direction directionCourante, boolean etat, int vitesseMaximale){
        this.couleur = couleur;
        this.directionCourante = directionCourante;
        this.etat = etat;
        this.nbRoues = nbRoues;
        this.vitesseCourante = vitesseCourante;
        this.vitesseMaximale = vitesseMaximale;

    }

    public void accelerer(int facteur)throws VitesseExcessive{
        if((vitesseCourante * facteur) < 0 || (vitesseCourante* facteur) >= vitesseMaximale){
            throw new VitesseExcessive();
        }
        vitesseCourante = vitesseCourante * facteur;
    }

    public void ralentir(int facteur){
        vitesseCourante = vitesseCourante * facteur;
    }

    public int quelleVitesseCourante(){
        return vitesseCourante;
    } 
    public void tournerDroite(){
        switch(directionCourante.nom){
            case "Nord":
                directionCourante = Est;
                break;
            case "Est":
                directionCourante = Sud;
                break;
            case "Sud":
                directionCourante = Ouest;
                break;
            case "Ouest":
                directionCourante = Nord;
                break;
        }
    }
    public void tournerGauche(){
        switch(directionCourante.nom){
            case "Nord":
                directionCourante = Ouest;
                break;
            case "Ouest":
                directionCourante = Sud;
                break;
            case "Sud":
                directionCourante = Est;
                break;
            case "Est":
                directionCourante = Nord;
                break;
        }
    }
    public void faireDemiTour(){
        switch(directionCourante.nom){
            case "Nord":
                directionCourante = Sud;
                break;
            case "Ouest":
                directionCourante = Est;
                break;
            case "Sud":
                directionCourante = Nord;
                break;
            case "Est":
                directionCourante = Ouest;
                break;
        }
    }
    public Direction quelleDirectionCourante(){
        return directionCourante;
    }

    public void changerEtat(){
            this.etat = !this.etat;
        }

}
