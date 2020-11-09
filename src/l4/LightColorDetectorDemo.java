package l4;

public class LightColorDetectorDemo {
    public static void main(String[] args) {
        LightColorDetector det = new LightColorDetector();
        System.out.println("If lightwave lenght = 400 color is: " + det.detect(400));
        System.out.println("If lightwave lenght = 23 color is: " + det.detect(23));
        System.out.println("If lightwave lenght = 777 color is: " + det.detect(777));
        System.out.println("If lightwave lenght = 421 color is: " + det.detect(421));
        System.out.println("If lightwave lenght = 655 color is: " + det.detect(655));
        System.out.println("If lightwave lenght = 381 color is: " + det.detect(381));
    }
}
