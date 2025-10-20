public class Carre {
    String nom;
    Coord point1;
    Coord point2;
    Coord point3;
    Coord point4;
    double cote;

    public Carre(String name, Coord a, Coord b, Coord c, Coord d){
        nom = name;
        point1 = a;
        point2 = b;
        point3 = c;
        point4 = d;
        cote = point2.abs - point1.abs ;
    }

    public Carre(String name, Coord a, double l){
        nom = name;
        point1 = a;
        cote = l;
        point2 = new Coord(point1.abs +l, point1.ord);
        point3 = new Coord(point1.abs, point1.ord - l);
        point4 = new Coord(point1.abs +l, point1.ord-l);
    }

    public double perimetre(){
        return 4*cote;
    }

    public double aire(){
        return Math.pow(cote, 2);
    }

    public void afficher(){
        System.out.println("Carré "+ nom + " avec des sommets aux points:");
        point1.afficher3();
        point2.afficher3();
        point3.afficher3();
        point4.afficher3();
    }

    public void comparer(Carre carre2){
        if(cote > carre2.cote){
            System.out.println("La longueur de côté de carré " + nom + " est plus grande");
        }
        else if (cote < carre2.cote) {
            System.out.println("La longueur de côté de carré " + carre2.nom + " est plus grande");
        }
        else{
            System.out.println("Les deux carrées ont la même longueur");
        }
    }
}
