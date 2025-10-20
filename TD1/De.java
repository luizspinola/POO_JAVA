import java.lang.Math;
import java.util.Scanner;
public class De{

    int valeur;
    int[] tousValeurs;
    int nbLances = 0;

    public De(){
        this.valeur = 1;
        this.tousValeurs = new int[4095];
        this.tousValeurs[this.nbLances] = this.valeur;
        this.nbLances++;
    }

    public De(int valeur){
        this.valeur = valeur;
        this.tousValeurs = new int[4095];
        this.tousValeurs[this.nbLances] = this.valeur;
        this.nbLances++;
    }

    public void AfficherDe(){
        System.out.println("Valeur actuel du dé: "+valeur);
        System.out.println("Historique des valeurs lancés:");
        for(int i = 0; i <= nbLances; i++){
            System.out.println(tousValeurs[i]);
        }
    }

    private void Lance(){
        valeur = (int)(Math.random() * 6) + 1;
        tousValeurs[nbLances] = valeur;
        nbLances++;
        System.out.println("Valeur du dé: "+valeur);
    }

    public void LancerDe(int nbFois){
        for(int i = 0; i<nbFois;i++){
            Lance();
        }
    }

    public void Jouer(De monDe){
        int nb_lances_jeu = 0;
        while(true){
            Lance();
            monDe.Lance();
            nb_lances_jeu++;
            if(valeur == monDe.valeur){
                System.out.println("nombre de lancers qu’il aura fallu pour gagner: "+nb_lances_jeu);
                break;
            }
        }
    }
    public void Jouernombre(De monDe, int nombre_specifique){
        int nb_lances_jeu = 0;
        while(true){
            Lance();
            monDe.Lance();
            nb_lances_jeu++;
            if((valeur == monDe.valeur) && (valeur == nombre_specifique)){
                System.out.println("nombre de lancers qu’il aura fallu pour gagner: "+nb_lances_jeu);
                break;
            }
        }
    }
}