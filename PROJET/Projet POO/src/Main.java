//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Patient test = new Patient("FULANO Ciclano", 33, Sexe.MASCULIN);
        test.Afficher_Test();

        Patient test2 = new Patient("FULANA Ciclana", 45, Sexe.FEMININ);
        test2.Afficher_Test();

        Hopital SaoDomingos = new Hopital("Hospital Sao Domingos", 50);

        Interniste doutorInterniste = new Interniste("Doutor DRAUZIO", 50, Sexe.MASCULIN, SaoDomingos);

        try{doutorInterniste.ajouterPatient(test2);}
        catch(NbPatientsImpossible e){System.out.println(e);}

        try{doutorInterniste.ajouterPatient(test);}
        catch(NbPatientsImpossible e){System.out.println(e);}


        }
    }