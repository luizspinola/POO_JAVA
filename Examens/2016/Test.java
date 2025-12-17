public class Test {
    public static void main(String[] args) {
      Vendeur monVendeur = new Vendeur("Macron", "Emmanuel", 5, 50000.00);
      Representant monRepresentant = new Representant("Bonaparte", "Luis", 2, 80000.00);
      
      try{Production monProducteur = new Production("Godard", "Jean-Luc", 10, 0);}
      catch (UniteException e){ System.out.println(e);}

      System.out.println(monVendeur.compareAncien(monRepresentant));

      

    }
}
