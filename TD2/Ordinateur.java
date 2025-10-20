import java.util.Scanner;
public class Ordinateur {
    public String nom;
    private static final int min = 1;
    private static final int max = 3;
    private static final int range = max - min + 1;

    public Ordinateur(){
        Scanner inputordinateur = new Scanner(System.in);
        System.out.print("Entrez un nom pour l'ordinateur: ");
        this.nom = inputordinateur.nextLine();
        System.out.println("");
    }

    public int getAllumette(){
        return (int)(Math.random() * range) + min;
    }
}
