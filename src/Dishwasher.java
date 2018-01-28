public class Dishwasher extends Appliances {
    private double actualConsumption;
    private double superClean = 265;

    public Dishwasher(String serialNo, double powerConsumption) {
        super(serialNo, powerConsumption);
    }

    @Override
    public double status() {
        System.out.println("Status Dishwasher");
        return this.actualConsumption;
    }


    public void start() {
        if (actualConsumption == 0)
            this.actualConsumption = getPowerConsumption();
        System.out.println("Start Dishwasher");

    }

    @Override
    public void stop() {
        System.out.println("Stop Dishwasher");
        this.actualConsumption = 0;
    }

    public boolean isOn() {
        if (this.actualConsumption == getPowerConsumption() || this.actualConsumption == this.getPowerConsumption() * 1.1 + superClean)
            return true;
        else
            return false;
    }

    public void superCleanOn() {
        System.out.println("SuperClean On");
        if (isOn() == true)
            this.actualConsumption = this.getPowerConsumption() * 1.1 + superClean;

    }


    public void superCleanOff() {
        System.out.println("SuperClean Off");
        if (isOn() == true)
            this.actualConsumption = getPowerConsumption();
    }

}
