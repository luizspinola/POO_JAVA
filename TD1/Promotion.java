public class Promotion {
    Etudiant[] etudiants_tab;
    int nb_max_etudiants;
    int nb_etudiants;
    static int pos_tab = 0;

    public Promotion(int nb_max_etudiants){
        this.nb_max_etudiants = nb_max_etudiants;
        etudiants_tab = new Etudiant[nb_max_etudiants];
    }

    public void afficher_etudiant_tab(){
        for(int i = 0; i <= nb_max_etudiants; i++){
            if(etudiants_tab[i] != null){
                etudiants_tab[i].afficher_etudiant();
            }
        }
    }

    public void SetPromotion(Etudiant etudiant){
        if(pos_tab <= nb_max_etudiants){
            etudiants_tab[pos_tab] = etudiant;
            pos_tab++;
        }else{
            System.out.println("Nombre max deja atteint!");
        }
    }

    public void ReveillePromotion(){
        for(int i = 0; i <= nb_max_etudiants; i++){
            if(etudiants_tab[i] != null){
                etudiants_tab[i].reveiller();
            }
        }
    }


}
