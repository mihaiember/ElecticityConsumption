public class StereoAmplifier extends Appliances {
    private double bassBoostConsumption = 1.3;
    private double actualConsumption;


    public StereoAmplifier(String serialNo, double powerConsumption) {
        super(serialNo, powerConsumption);
    }

    @Override
    public double status() {
        System.out.println("Status StereoAmplifier");
        return this.actualConsumption;
    }


    public void start() {
        if(actualConsumption==0)
            this.actualConsumption = getPowerConsumption();
        System.out.println("Start StereoAmplifier");

    }

    @Override
    public void stop() {
        System.out.println("Stop StereoAmplifier");
        this.actualConsumption=0;
    }

    public boolean isOn(){
        if (this.actualConsumption == getPowerConsumption() || this.actualConsumption==this.getPowerConsumption()*bassBoostConsumption)
            return  true;
        else
            return false;
    }

    public void bassBoostOn() {
        System.out.println("BassBoost On");
        if (isOn()==true)
            this.actualConsumption = this.getPowerConsumption()*bassBoostConsumption;

    }


    public void BassBoostOff() {
        System.out.println("BassBoost Off");
        if(isOn()==true)
            this.actualConsumption = getPowerConsumption();
    }
}