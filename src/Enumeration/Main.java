package Enumeration;

public class Main {
    public static void main(String[] args) {
        Jours[] semaine= Jours.values();

        for (int i =0; i< semaine.length; i++) {
            System.out.println(semaine[i]);
        }
    }

}
