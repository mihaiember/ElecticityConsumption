public abstract class Appliances implements HouseholdAppliance {

    private String serialNo;
    private double powerConsumption;

    Appliances(String serialNo, double powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.serialNo = serialNo;
    }

    public  abstract void start();
    public abstract void stop();
    public abstract double status();


    double getPowerConsumption() {
        return powerConsumption;
    }

    /*Appliances SonyStereo = new StereoAmplifier("SN210", 210);
    StereoAmplifier stereo = (StereoAmplifier) SonyStereo;
    //Appliances SamsungVacumCleaner = new VacumCleaner("SN L911", 550, 280)};
    */

}
