import java.util.ArrayList;
import java.util.Random;
public class Hopital {
    public final String Nom;
    protected ArrayList<Medecin> Medecin_tab = new ArrayList<>();
    public final int nbChambre;
    protected ArrayList<Integer> chambreTableau = new ArrayList<>();
    private Random random;

    public Hopital(String Nom, int nbChambre){
        this.Nom = Nom;
        this.nbChambre = nbChambre;

        for(int i = 1; i <= nbChambre; i++){
            chambreTableau.add(i);
        }
    }

    public int roomSelect(){
        int randomIndex = random.nextInt(chambreTableau.size());
        int selectedRoom = chambreTableau.get(randomIndex);
        chambreTableau.remove(randomIndex);
        return selectedRoom;
    }

    public void openRoom(int roomNumber){
        chambreTableau.add(roomNumber);
    }


}
