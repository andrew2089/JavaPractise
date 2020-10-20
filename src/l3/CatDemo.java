package l3;

public class CatDemo {
    public static void main(String[] args) {

        Cat kisa = new Cat("kisa");
        kisa.meow();
        kisa.meow();

        Cat muris = new Cat("Muris");
        muris.meow();

        kisa.eat("fish");
        kisa.eat("mastard");
        muris.eat("milk");

    }
}
