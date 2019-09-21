package Dictionnaire;

public class Dictionnaire {
    public String titre;
    private static int nbDictionnaire=0;
    static Dictionnaire dictionnaire=null;


   public static Dictionnaire  createDictionnaire() {

       if (nbDictionnaire ==0) {
           dictionnaire = new Dictionnaire();
       }
       return dictionnaire;
    }

    public Dictionnaire getInstance() {
       return this;
    }

    private Dictionnaire() {
       titre = "Larousse";
       nbDictionnaire ++;
    }
}
