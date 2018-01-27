public class VacumCleaner extends Appliances {
    private double turboOnConsumption;
    private double actualConsumption;
    private double turbo;

    public VacumCleaner(String serialNo, double powerConsumption, double turboOnConsumption) {
        super(serialNo, powerConsumption);
        this.turboOnConsumption = turboOnConsumption;
    }

    @Override
    public double status() {
        System.out.println("Status VacumCleaner");
        return this.actualConsumption;
    }


   public void start() {
        if(actualConsumption==0)
        this.actualConsumption = getPowerConsumption();
        System.out.println("Start VacumCleaner");

    }

    @Override
    public void stop() {
        System.out.println("Stop VacumCleaner");
        this.actualConsumption=0;
    }

    boolean isOn(){
        if (this.actualConsumption == getPowerConsumption() || this.actualConsumption==this.turboOnConsumption + this.getPowerConsumption())
            return  true;
        else
            return false;
    }


    public void turboOn() {
        System.out.println("Turbo On");
        if (isOn()==true)
            this.turbo = this.turboOnConsumption + this.getPowerConsumption();
            this.actualConsumption=turbo;
    }


    public void turboOff() {
        System.out.println("Turbo Off");
        if(isOn()==true)
        this.actualConsumption = getPowerConsumption();
    }


}