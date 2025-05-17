package SmartHomeAutomation;

public class SmartLight extends SmartDevice{
    public SmartLight(PowerSource powerSource) {
        super(powerSource);
    }

    @Override
    public void showDetails() {
        System.out.println("SmartLight powered by " + getPowerSource().getType());
        //enhance
        if(getWiFiModule() !=null){
            System.out.println("Connected to WiFi: " + getWiFiModule().getSsid());
        }


    }
}
