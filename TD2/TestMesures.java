import java.util.Scanner;
public class TestMesures {
    public static void main(String[] args) {
        int value;
        Mesure measurements = new Mesure();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Entrez une mesure: ");
            value = input.nextInt();
            if(value == 0){
                measurements.afficherMoyenne();
                input.close();
                break;
            }
            measurements.ajouter(value);
            System.out.println("");
        }
    }
}
