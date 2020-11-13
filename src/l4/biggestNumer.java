package l4;

public class biggestNumer {
    String big (int a,int b , int c){
        if(a > b && a > c){
            return "a is the biggest " + a;
        }
        if (b > a && b > c ){
            return " b is the biggest " + b;
        }
        if (c > a && c > b){
            return "c is the biggest " + c;
        }
        return "!";
    }
}
