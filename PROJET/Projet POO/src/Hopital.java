import java.util.ArrayList;
public class Hopital {
    public final String Nom;
    protected ArrayList<Medecin> Medecin_tab = new ArrayList<>();
    public final int nbChambre;
    protected ArrayList<Integer> chambreTableau = new ArrayList<>();
    private int occupiedRooms = 0;

    public Hopital(String Nom, int nbChambre){
        this.Nom = Nom;
        this.nbChambre = nbChambre;

        for(int i = 1; i <= nbChambre; i++){
            chambreTableau.add(i);
        }
    }

    public int roomSelect(){
        int selectedRoom = chambreTableau.get(occupiedRooms+1);
        chambreTableau.remove(occupiedRooms+1);
        occupiedRooms++;
        return selectedRoom;
    }

    public void openRoom(int roomNumber){
        chambreTableau.add(roomNumber);
        occupiedRooms--;
    }


}
