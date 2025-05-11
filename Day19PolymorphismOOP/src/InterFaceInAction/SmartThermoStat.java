package InterFaceInAction;

public class SmartThermoStat implements InterFaceNew{
    private boolean isOn = false;
    private double temperature = 25;
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart Thermostat is turned ON.");

    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart Thermostat is turned OFF.");

    }

    @Override
    public void getStatus() {
        //InterFaceNew.super.getStatus();
        String status = isOn ? "ON":"OFF";
        System.out.println("Smart Thermostat Status: "
        + status + ", Temperature: " + temperature + "C");
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
        System.out.println("Temperature set to: " + temperature + "C.");
    }

}
