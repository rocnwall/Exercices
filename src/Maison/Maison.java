package Maison;

public class Maison implements AvecChauffage, AvecClimatisation {
    int temperature;

    public Maison(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void chauffer() {
        temperature ++;
    }

    @Override
    public void refroidir() {
        temperature --;
    }

    @Override
    public String toString() {
        final String s = "La maison a une teméprature de " + temperature + " degrés";
        return s;
    }
}
