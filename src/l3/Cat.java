package l3;

public class Cat {

    public String name;

    public void meow(){
        System.out.println(this.name + " Meow bitch");
    }

    public Cat(String name) {
        this.name = name;
    }
    public void eat(String food){
        System.out.println(this.name + ": Ou such delicious " + food + " you gave me");
        meow();
    }
}
