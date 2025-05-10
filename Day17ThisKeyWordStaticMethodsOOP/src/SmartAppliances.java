public class SmartAppliances {

    String applianceName;
    String applianceType;
    String appliancePowerStatus;


    //we create a constructor
    public SmartAppliances(String applianceName,String applianceType,String appliancePowerStatus){
        this.applianceName = applianceName;
        this.applianceType = applianceType;
        this.appliancePowerStatus = appliancePowerStatus;
    }

    //this keyword to return current class instance

    public SmartAppliances getInstance(){
        return this;
    }

    //copy constructor
    public SmartAppliances(SmartAppliances smartAppliance){
        this.applianceName = smartAppliance.applianceName;
        this.applianceType = smartAppliance.applianceType;
        this.appliancePowerStatus = smartAppliance.appliancePowerStatus;
    }

    //show details method public class or default class
    void showDetails(){
        System.out.println("Appliance Name:" + applianceName);
        System.out.println("Appliance Type:" + applianceType);
        System.out.println("Appliance Power Status:" + appliancePowerStatus);
    }

}
