package SmartHomeAutomation;

public class Main {
    public static void main(String[] args) {
        PowerSource powerSourceBattery = new PowerSource("Battery");
        PowerSource powerSourceElectric = new PowerSource("Electric");

        //constructor DI
        SmartLight smartLight = new SmartLight(powerSourceBattery);
        SmartThermostat smartThermostat = new SmartThermostat(powerSourceElectric);


        //setter DI for wifi

        WiFiModule wiFiModuleLight = new WiFiModule("HomeWiFi-Light");
        WiFiModule wiFiModuleThermostat = new WiFiModule("HomeWifi-ThermoStat");

        smartLight.setWiFiModule(wiFiModuleLight);
        smartThermostat.setWiFiModule(wiFiModuleThermostat);

        //display details after setter

        smartLight.showDetails();
        smartThermostat.showDetails();
    }
}
