package InterFaceInAction;

public class SmartLight implements InterFaceNew{

    private boolean isOn = false;
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("The smart light has been turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("The smart light has been turned off.");

    }

    @Override
    public void getStatus() {
        //InterFaceNew.super.getStatus();
        String status = isOn ? "ON":"OFF"; //one line if status. if status is IsOn, say On, else off
        System.out.println("Snart Light status:" + status);

    }

}
