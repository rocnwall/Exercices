package ChaineCar;

public class Main {
    public static void main(String[] args) {
        System.out.println(majuscule("tOti est trop FOrt"));
        System.out.println("Nombre de a : "+ countNumbersA("Il y a beaucoup de a dans cette phrase"));
    }

    static String majuscule(String chaine) {
        return chaine.toUpperCase();
    }

    static int countNumbersA (String chaine) {
        int count = 0;
        boolean isFinished=false;
        int length=chaine.length();
        int position = 0;
        int i=0;

        while (!isFinished) {
            i = chaine.indexOf('a', position);
            if (i == -1)
                isFinished = true;
            else {
                count++;
                position = i+1;
            }
        }
        return count;
    }
}
