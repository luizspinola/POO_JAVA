import java.util.Arrays;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        int nb_mots;
        Scanner input = new Scanner(System.in);
        System.out.print("Combien de mots ? ");
        nb_mots = input.nextInt();
        String[] mots = new String[nb_mots+1];
        System.out.println("donnez vos mots");
        for (int i = 0; i <= nb_mots; i++) {
            mots[i] = input.nextLine();
            mots[i] = mots[i].toLowerCase();
        }
        
        Arrays.sort(mots);
        System.out.println("Liste par ordre alphabetique :");
        for (String i : mots) {
            System.out.println(i);
        }
    }
    
}
