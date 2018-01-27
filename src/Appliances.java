public abstract class Appliances implements HouseholdAppliance {

    private String serialNo;
    private double powerConsumption;

    public Appliances(String serialNo, double powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.serialNo = serialNo;
    }

    public  abstract void start();
    public abstract void stop();
    public abstract double status();


    public double getPowerConsumption() {
        return powerConsumption;
    }

}
