import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        String er = "er";
        String verbe;
        Scanner input = new Scanner(System.in);
        System.out.print("donnez un verbe regulier du premier groupe: ");
        verbe = input.nextLine();
        while(true){
            StringBuffer suffixe = new StringBuffer(verbe);
            suffixe.delete(0,verbe.length() - 2);
            if(er.equals(suffixe.toString())){
                break;
            }
            else{
                System.out.println("");
                System.out.print("*** il ne se termine pas par er - donnez-en un autre : ");
                verbe = input.nextLine();
            }
        }

        String radical = verbe.toString().substring(0, verbe.length() - 2);
        System.out.println("");
        System.out.println("je " + radical + "e");
        System.out.println("tu " + radical + "es");
        System.out.println("il/elle " + radical + "e");
        System.out.println("nous " + radical + "ons");
        System.out.println("vous " + radical + "ez");
        System.out.println("ils/elles " + radical + "ent");
    }
}
