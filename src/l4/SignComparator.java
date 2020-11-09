package l4;

public class SignComparator {

    public String compare(int number) {
        if (number > 0) {
            return "number is positive";
        }
        if (number < 0) {
            return "number is negative";
        }
        if (number == 0) {
            return "number is equal to zero";
        }
        else return "its not number";
    }
}
