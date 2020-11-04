package l4;

public class switchDemo {
    public static void main(String[] args) {
        String today = "tuesday";

        switch (today){
            case "monday":
                System.out.println("Oh no  .... again..");
                break;
            case "tuesday":
                System.out.println("Java day");
                break;
            case "wednesday":
                System.out.println("almost friday");
                break;
            case "friday":
                System.out.println("time to do a homework");
                break;
            default:
                System.out.println("Oh uh");
        }
    }
}
