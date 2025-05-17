package SmartHomeAutomation;

public abstract class SmartDevice {
    private PowerSource powerSource;
    private WiFiModule wiFiModule;

    public SmartDevice(PowerSource powerSource){
        this.powerSource = powerSource;
    }

    public PowerSource getPowerSource() {
        return powerSource;
    }

    public void setWiFiModule(WiFiModule wiFiModule) {
        this.wiFiModule = wiFiModule;
    }

    public WiFiModule getWiFiModule() {
        return wiFiModule;
    }

    //abstract method
    public abstract void showDetails();
}
