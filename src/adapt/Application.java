package adapt;

/**
 * @Auther:leeling
 * @Date:2020/2/11 Description:adapt
 */
public class Application {
    public static void main(String[] args) {
        AlternateCurrent current = new CurrentElectric();
        Wash wash = new Wash();
        wash.turnon(current);
        Recorder recorder = new Recorder();
        ObjectC objectC = new ElectricAdapter(current);
        recorder.turnon(objectC);

    }


}
