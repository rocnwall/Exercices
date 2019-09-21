package Comptage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> comptage = new TreeMap<>();
        Path path = Paths.get("./Ressources/chanson.txt");
        boolean exists = Files.exists(path);
        if (!exists) {
            System.out.print("Le fichier " + path + " n'existe pas !");
            return;
        }
        List<String> texte = new ArrayList<>();
        try {
            texte = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String ligne : texte) {
            String[] mots = ligne.split("[^a-zA-Z]");
            for (String mot : mots) {
                mot = mot.toLowerCase();
                if (!mot.isEmpty()) {
                    int nboccurences = 1;
                    if (comptage.containsKey(mot)) {
                        nboccurences = comptage.get(mot);
                        nboccurences += 1;
                    }
                    comptage.put(mot, nboccurences);
                }
            }
        }

        // Ecriture du dictionnaire
        Path fichierResultat = Paths.get("./Ressources/resultat.txt");
        ArrayList<String> lignesAEcrire = new ArrayList<>();
        for (Map.Entry<String, Integer> entreeOccurence : comptage.entrySet()) {
            lignesAEcrire.add(entreeOccurence.getKey() + " : " + entreeOccurence.getValue());
        }
        Files.write(fichierResultat, lignesAEcrire);

        int total=0;
        for (Integer value : comptage.values()) {
            total += value;
        }

        // On peut utiliser une méthode de la classe Collections pour créer une liste à u  seul élément
        Set<String> ligneTotal=Collections.singleton("Nombre total de mots " + total);
        Files.write(fichierResultat, ligneTotal, Charset.forName("CP1252"), StandardOpenOption.APPEND);

        //Recherche des mots les plus présents
        List<String> motsLesPlusPrésents = MotsLesPlusPresents(comptage);
        System.out.println(motsLesPlusPrésents);
    }

    private static List<String> MotsLesPlusPresents(Map <String, Integer> comptage) {
        int maxvalue=0;
        // Search max value
        for (Integer value : comptage.values()) {
            maxvalue = Math.max(value, maxvalue);
        }
        System.out.println(maxvalue);


        List<String> motsLesPlusPresents = new ArrayList<>();
        for (Map.Entry<String, Integer> entreeOccurence : comptage.entrySet()) {
            if (entreeOccurence.getValue() == maxvalue) {
                motsLesPlusPresents.add(entreeOccurence.getKey());
            }
        }
        return motsLesPlusPresents;
    }
}