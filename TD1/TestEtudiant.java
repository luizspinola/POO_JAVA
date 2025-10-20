public class TestEtudiant{
    public static void main(String[] args){
        Etudiant monEtudiant1 = new Etudiant("Luiz", 21, "Polytech Marseille", true);
        Etudiant monEtudiant2 = new Etudiant();
        monEtudiant2.setActivite(false);

        monEtudiant1.afficher_etudiant();
        monEtudiant2.afficher_etudiant();

        monEtudiant2.reveiller();
        monEtudiant2.reveiller();
    }
}