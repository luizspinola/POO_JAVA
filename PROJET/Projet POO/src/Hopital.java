import java.util.ArrayList;
import java.util.List;
public class Hopital {
    public final String Nom;
    protected ArrayList<Medecin> Medecin_tab = new ArrayList<>();
    public final int nbChambre;
    protected ArrayList<Integer> chambreTableau = new ArrayList<>();
    private int roomindex = 0;
    Boolean condition = true;

    public Hopital(String Nom, int nbChambre){
        this.Nom = Nom;
        this.nbChambre = nbChambre;

        for(int i = 1; i <= nbChambre; i++){
            chambreTableau.add(i);
        }
    }

    public int roomSelect(){
        while(condition){
            if(check(chambreTableau)){
                roomindex++;
            }else{
                condition = !(condition);
            }
            
        }
        int selectedRoom = chambreTableau.get(roomindex);
            chambreTableau.remove(roomindex);
            roomindex++;
        return selectedRoom;
    }

    public void openRoom(int roomNumber){
        chambreTableau.add(roomNumber);
        roomindex = roomNumber;
    }

    public static boolean check(List<Integer> list, String itemToBeSearched){
        boolean isItemFound =false;
        for(int singleItem: list){
            if(singleItem.equals(itemToBeSearched)){
                isItemFound = true;
                return isItemFound;
        }
    }
    return  isItemFound;
}


}
