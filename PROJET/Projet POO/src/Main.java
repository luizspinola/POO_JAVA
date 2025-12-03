//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Patient test = new Patient("FULANO Ciclano", 33, Personne.Sexe.MASCULIN);
        test.Afficher_Test();

        Patient test2 = new Patient("FULANA Ciclana", 45, Personne.Sexe.FEMININ);
        test2.Afficher_Test();

        }
    }