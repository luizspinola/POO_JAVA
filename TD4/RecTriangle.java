public class RecTriangle extends Triangle implements Zoom {
    
    public RecTriangle(double[] taille_cote){
        super(taille_cote);
    }

    public void zoomer(double factor){
        for(int i = 0; i < taille_cote.length; i++){
            taille_cote[i] = taille_cote[i] * factor;
        }
    }

}
