package Dictionnaire;

public class Main {
    public static void main(String[] args) {
        Dictionnaire dico = Dictionnaire.createDictionnaire();
        System.out.println(dico.titre);
        System.out.println(dico.getInstance());

        Dictionnaire dico2 = Dictionnaire.createDictionnaire();
        System.out.println(dico.titre);
        System.out.println(dico.getInstance());
    }

}
