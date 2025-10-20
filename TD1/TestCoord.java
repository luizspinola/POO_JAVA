public class TestCoord {

    public static void main(String[] args){
        Coord myCoord = new Coord(0);
        myCoord.afficher();
        myCoord.afficher2();
        myCoord.afficher3();

        //EXERCISE 3
        System.out.println(myCoord.abs);
        System.out.println(myCoord.ord);

        //EXERCISE 5
        myCoord.translateCoord(10,6);
        myCoord.afficher2();
    }
}
