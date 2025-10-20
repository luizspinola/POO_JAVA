public class TestCarre {
    public static void main(String[] args) {
        Carre carre1 = new Carre("Quadrado 1",
                       new Coord(0, 0), 8);
        Carre carre2 = new Carre("Quadrado 2",
                       new Coord(4, 4), new Coord(8, 4),
                       new Coord(4, 0), new Coord(8, 0));

        carre1.afficher();
        carre2.afficher();

        carre1.comparer(carre2);
        carre2.comparer(carre1);
    }
}
