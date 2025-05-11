package InterFaceInAction;

public class Main {
    public static void main(String[] args){

        InterFaceNew light = new SmartLight();
        InterFaceNew thermoStat = new SmartThermoStat();

        light.turnOn();
        light.getStatus();

        thermoStat.turnOn();
        //we need to cast

        ((SmartThermoStat) thermoStat).setTemperature(20.0);
        thermoStat.getStatus();


    }
}
