//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hopital Princeton = new Hopital("Princeton-Plainsboro Teaching Hospital", 50);
        Interniste House = new Interniste("House Gregory", 50, Sexe.MASCULIN, Princeton);
        Patient Luiz = new Patient("Spinola Luiz", 21, Sexe.MASCULIN, Boolean.FALSE);

        House.Traiter(Luiz, 6);


        }
    }