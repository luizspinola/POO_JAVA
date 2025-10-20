import java.util.Scanner;

public class Joueur {
    public String nom;

    public Joueur(){
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un nom pour le joueur: ");
        this.nom = input.nextLine();
        System.out.println("");
    }

    public int getAllumette(){
        Scanner input = new Scanner(System.in);
        int currentAllumette = 0;
        while(true){
            System.out.print("Entrez un valeur entre 1 et 3: ");
            currentAllumette = input.nextInt();
            if((currentAllumette < 1) || (currentAllumette > 3)){
                System.out.println("");
                System.out.println("Valeur pas compris entre 1 et 3!");
            }else{
                return currentAllumette;
            }
        }
    }
}
