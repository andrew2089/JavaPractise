package l4;

public class LevelTwoFirstDemo {
    public static void main(String[] args) {
        LevelTwoFirst level = new LevelTwoFirst();
        System.out.println("first = 3 ,second = 5 " + level.biggest(3,5));
        System.out.println("first = 4, second = 7 " + level.biggest(4,7));
        System.out.println("first =10, second = 1 " + level.biggest(10,1));
    }
}
