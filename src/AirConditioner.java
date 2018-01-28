public class AirConditioner extends Appliances {
    private double arcticColdConsumption = 1.55;
    private double actualConsumption;

    public AirConditioner(String serialNo, double powerConsumption) {
        super(serialNo, powerConsumption);
    }

    @Override
    public void start() {
        if (actualConsumption == 0)
            this.actualConsumption = getPowerConsumption();
        System.out.println("Start AerConditioner");
    }

    @Override
    public void stop() {
        System.out.println("Stop AerConditioner");
        this.actualConsumption = 0;
    }

    @Override
    public double status() {
        System.out.println("Status AerConditioner");
        return this.actualConsumption;
    }

    public boolean isOn() {
        if (this.actualConsumption == getPowerConsumption() || this.actualConsumption == this.getPowerConsumption() * arcticColdConsumption)
            return true;
        else
            return false;
    }

    public void arcticColdOn() {
        System.out.println("ArcticCold On");
        if (isOn() == true)
            this.actualConsumption = this.getPowerConsumption() * arcticColdConsumption;

    }


    public void ArcticColdOff() {
        System.out.println("ArcticCold Off");
        if (isOn() == true)
            this.actualConsumption = getPowerConsumption();
    }
}
