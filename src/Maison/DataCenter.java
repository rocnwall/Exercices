package Maison;

public class DataCenter implements AvecClimatisation {
    int temperature;

    public DataCenter(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void refroidir() {
        temperature = 20;
    }


}
