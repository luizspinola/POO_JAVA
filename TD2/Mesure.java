import java.util.ArrayList;
public class Mesure {
    static ArrayList<Integer> valeur = new ArrayList<Integer>();
    static int nb = 0;
    static int som = 0;
    private static final int min = -100;
    private static final int max = 100;

    public Mesure(){}

    public Mesure(int valeur){
        if((valeur < min)||(valeur > max)){
            System.out.println("Mesure hors intervalle");
            return;
        }else{
            this.valeur.add(valeur); 
            nb++;
            som = som + valeur;
        }
        
    }

    public void ajouter(int valeur){
        if((valeur < min)||(valeur > max)){
            System.out.println("Mesure hors intervalle");
        }else{
            this.valeur.add(valeur); 
            nb++;
            som = som + valeur;
        }
    }

    public void afficherMoyenne(){
        if(som == 0){
            System.out.println("zéro mesures");
            return;
        }
        System.out.println("La moyenne des "+nb+" mesures est :"+(som/nb));
    }

}
