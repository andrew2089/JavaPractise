package l4;

public class Calculator {
    public int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public int sub(int firstNumer , int secondNumber){
        return firstNumer - secondNumber;
    }
    public int div(int firstNumber , int secondNumber){
        return firstNumber / secondNumber;
    }
    public int mul (int fistNumber , int secondNumber){
        return fistNumber * secondNumber;
    }
    public boolean isEven(int number){
        if(number % 2  == 0){
            return true;
        }
        return false;
    }
}
