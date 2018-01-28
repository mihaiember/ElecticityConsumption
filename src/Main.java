public class Main {
    public static void main(String[] args) {
        Appliances vacumCleaner = new VacumCleaner("SN 89987", 650, 300);
        VacumCleaner vacumCleanerLG=(VacumCleaner)vacumCleaner;//

        Appliances stereoAmp = new StereoAmplifier("SN 5897", 154.23);
        StereoAmplifier amplifierSony = (StereoAmplifier) stereoAmp;


        Appliances dishwasher = new Dishwasher("859-789D", 350);
        Dishwasher dishwasherWhirlpool=(Dishwasher) dishwasher;

        Appliances airConditioner = new AirConditioner("A589", 1100);
        AirConditioner airConditionerElectrolux = (AirConditioner) airConditioner;

        amplifierSony.start();
        airConditionerElectrolux.start();
        airConditionerElectrolux.arcticColdOn();
        dishwasherWhirlpool.start();

        System.out.println(vacumCleanerLG.status()+amplifierSony.status()+dishwasherWhirlpool.status()+airConditionerElectrolux.status());
    }
}
