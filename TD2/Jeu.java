public class Jeu {
    public int nombre = 21;

    public void afficherAllumete(){
        for(int i = 0; i < nombre; i++){
            System.out.print("|");
        }
        System.out.println("");
    }

    public void commencerJeu(){
        Joueur myJoueur = new Joueur();
        Ordinateur myOrdinateur = new Ordinateur();
        int joueurCurrentAllumette;
        int ordinateurCurrentAllumette;
        String winner;

        while(true){
            joueurCurrentAllumette = myJoueur.getAllumette();
            if ((nombre - joueurCurrentAllumette) <= 0){
                winner = myJoueur.nom;
                break;
            }
            nombre = nombre - joueurCurrentAllumette;
            afficherAllumete();

            ordinateurCurrentAllumette = myOrdinateur.getAllumette();
            if ((nombre - ordinateurCurrentAllumette) <= 0){
                winner = myOrdinateur.nom;
                break;
            }
            nombre = nombre - ordinateurCurrentAllumette;
            afficherAllumete();
        }

        System.out.println(winner + " a gagné!");
        
    }
}
