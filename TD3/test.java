public class test {
    public static void main(String[] args) {
        Obstetricien docteur = new Obstetricien("luiz", "sao domingos");
        FemmeEnceinte fulano = new FemmeEnceinte();
        if(fulano instanceof FemmeEnceinte){
            System.out.println("instance");
        }else{
            System.out.println("not instance");
        }
        docteur.AjouterPatient(fulano);
        docteur.AjouterPatient(new Patient("silva", "juarez", "10062004"));
        docteur.AfficherPatient();
    }
}
