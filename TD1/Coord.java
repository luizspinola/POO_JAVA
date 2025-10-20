public class Coord{
    public double abs ;
    public double ord ;

    public Coord(double a, double b){
        abs=a ; 
        ord=b ;
    }

    public Coord(){
        ord=0 ;
        abs=0 ;
    }

    public Coord(double a) {
      ord = a;
      abs = 5;
   }

    public void afficher(){
        System.out.println("Les coordonnées du point sont : ") ;
        System.out.println(abs) ;
        System.out.println(ord) ;
    }

    public void afficher2(){
        System.out.println("Les coordonnées du point sont : "+abs+" et "+ord);
    }

    public void afficher3(){
        System.out.println("("+abs+";"+ord+")");
    }

    public void translateCoord(double x, double y){
        abs = abs + x;
        ord = ord + y;
    }
}


