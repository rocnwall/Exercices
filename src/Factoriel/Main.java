package Factoriel;

public class Main {

    public static void main(String[] args)  {
        int result = 0;
        try {
            result = factorielle(17);
        } catch (FactorielleException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

    static int factorielle(int nombre) throws FactorielleException {
        int factorielle = 1;
        for (int i = 1; i <= nombre; i++) {
            factorielle = factorielle * i;
            if (factorielle < 0)
                throw (new FactorielleException("Dépassement mémoire"));
        }
        return factorielle;
    }
}
