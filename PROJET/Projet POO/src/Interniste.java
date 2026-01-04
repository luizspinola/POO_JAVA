import java.util.Date;
import java.util.Random;
public class Interniste extends Medecin{

    Random generator = new Random();
    public Interniste(String NomPrenom, int Age, Sexe Sexe, Hopital Hopital){
        super(NomPrenom, Age, Sexe, Hopital);
        nb_patients_max = 1;
    }



    public void Traiter(Patient Patient, int nbMedicaments){
        int tryNumber = 1;
        int bonMedicament = generator.nextInt(nbMedicaments) + 1;
        long ms = System.currentTimeMillis();
        Date currentDate = new Date(ms);
        System.out.println("Le traitement commence: "+currentDate);
        while(tryNumber != bonMedicament){
            System.out.println("Mauvais médicament choisi par le jour "+tryNumber+". Le patient est malade");
            ms = ms + 86400000; //1 Jour en milisecondes
            currentDate.setTime(ms);
            System.out.println("Le traitement continue: "+currentDate);
            tryNumber++;
        }
        System.out.println("Bon médicament choisi par le jour "+tryNumber+". Le patient est guéri");
        System.out.println("Le traitement a fini: "+currentDate);



    }
} 