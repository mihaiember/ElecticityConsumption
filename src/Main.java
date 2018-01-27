public class Main {
    public static void main(String[] args) {

        Appliances vacumCleaner = new VacumCleaner("SN 89987", 650, 300);
        VacumCleaner vacum=(VacumCleaner)vacumCleaner;//downcasting


        /*System.out.println(vacumCleaner.status());
        vacumCleaner.start();
        System.out.println(vacumCleaner.status());
        vacum.turboOn();
        System.out.println(vacumCleaner.status());
        vacum.turboOff();
        System.out.println(vacumCleaner.status());
        System.out.println(vacumCleaner.status());
        vacumCleaner.stop();
        System.out.println(vacumCleaner.status());*/

        Appliances stereoAmp = new StereoAmplifier("SN 5897", 154.23);
        StereoAmplifier stereo = (StereoAmplifier) stereoAmp;

        System.out.println(stereo.status());
        stereo.bassBoostOn();
        System.out.println(stereo.status());
        stereo.start();
        System.out.println(stereo.status());
        stereo.bassBoostOn();
        System.out.println(stereo.status());
        stereo.BassBoostOff();
        System.out.println(stereo.status());
        
    }
}
