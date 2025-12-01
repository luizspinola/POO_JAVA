public class AppliVehicules {
    public static void main(String arg[]) throws NbRouesImpossible,VitesseExcessive {
        Voiture maVoiture=null ;
        Voiture taVoiture=null ;
        Voiture saVoiture=null ;
        Voiture notreVoiture=null ;

        Velo monVelo=null;
        Velo tonVelo=null;
        Velo sonVelo=null;
        Velo notreVelo=null;

        Camion monCamion=null ;
        Camion tonCamion=null;
        Camion sonCamion=null;
        Camion notreCamion=null;

        try{maVoiture=new Voiture("verte", -10, Dirigeable.Sud,true, 5);}
        catch (VitesseExcessive e){ System.out.println(e);}
        catch(NbRouesImpossible e){ System.out.println(e); }
        
        try{ taVoiture=new Voiture("bleue", 150, Dirigeable.Nord,true, 4);}
        catch (VitesseExcessive e){ System.out.println(e);}
        catch(NbRouesImpossible e){ System.out.println(e); }

        try{ saVoiture=new Voiture("rouge", 30, Dirigeable.Ouest,true, 2);}
        catch (VitesseExcessive e){ System.out.println(e);}
        catch(NbRouesImpossible e){ System.out.println(e); }

        try{ notreVoiture=new Voiture("rouge", 80, Dirigeable.Est,true, 4);}
        catch (VitesseExcessive e){ System.out.println(e);}
        catch(NbRouesImpossible e){ System.out.println(e); }

        try{ monVelo=new Velo("beige", 80, Dirigeable.Est,true, 4);}
        catch (VitesseExcessive e){ System.out.println(e);}
        catch(NbRouesImpossible e){ System.out.println(e); }

        try{ tonVelo=new Velo("gris", -30, Dirigeable.Ouest,true, 2);}
        catch (VitesseExcessive e){ System.out.println(e);}
        catch(NbRouesImpossible e){ System.out.println(e); }

         try{ sonVelo=new Velo("vermeil", 35, Dirigeable.Sud,true, 0);}
        catch (VitesseExcessive e){ System.out.println(e);}
        catch(NbRouesImpossible e){ System.out.println(e); }

        try{ notreVelo=new Velo("noir", 25, Dirigeable.Nord,true, 2);}
        catch (VitesseExcessive e){ System.out.println(e);}
        catch(NbRouesImpossible e){ System.out.println(e); }

        try{monCamion=new Camion("marron", 0, 50, Dirigeable.Est,true);}
        catch(NbRouesImpossible e){ System.out.println(e); }
        catch (VitesseExcessive e){ System.out.println(e);}

        try{tonCamion=new Camion("rose", 0, 50, Dirigeable.Est,true);}
        catch(NbRouesImpossible e){ System.out.println(e); }
        catch (VitesseExcessive e){ System.out.println(e);}

        try{sonCamion=new Camion("jaune", 0, 50, Dirigeable.Est,true);}
        catch(NbRouesImpossible e){ System.out.println(e); }
        catch (VitesseExcessive e){ System.out.println(e);}

        try{notreCamion=new Camion("rouge", 0, 50, Dirigeable.Est,true);}
        catch(NbRouesImpossible e){ System.out.println(e); }
        catch (VitesseExcessive e){ System.out.println(e);}

        

        if(maVoiture!=null){
            maVoiture.afficher();
            maVoiture.faireDemiTour();
            try{maVoiture.accelerer(40);}
            catch(VitesseExcessive e){ System.out.println(e);}
            maVoiture.afficher();
            maVoiture.changerEtat();

        }
    }
}
