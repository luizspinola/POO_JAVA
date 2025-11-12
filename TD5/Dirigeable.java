public interface Dirigeable {
    Direction Sud=new Direction(1,"Sud");
    Direction Est=new Direction(2,"Est");
    Direction Nord=new Direction(3,"Nord");
    Direction Ouest=new Direction(4,"Ouest");

    void accelerer(int facteur)throws VitesseExcessive; //pour accélerer d’un facteur donné
    void ralentir(int facteur); // pour ralentir
    int quelleVitesseCourante(); // vitesse courante
    void tournerDroite(); // pour tourner à droite
    void tournerGauche(); // pour tourner à gauche
    void faireDemiTour(); // pour faire demi-tour
    Direction quelleDirectionCourante();
}