package l4;

public class LightColorDetector {
    public String detect(int wavelenght) {
        if (wavelenght >= 380 && wavelenght <= 449) {
            return "Violet";
        }
        if (wavelenght >= 450 && wavelenght <= 494) {
            return "Blue";
        }
        if (wavelenght >= 495 && wavelenght <= 569) {
            return "Green";
        }
        if (wavelenght >= 570 && wavelenght <= 589) {
            return "Yellow";
        }
        if (wavelenght >= 590 && wavelenght <= 619) {
            return "Orange";
        }
        if (wavelenght >= 620 && wavelenght <= 750) {
            return "Red";
        } else
            return "Invisible Light";
    }

}

