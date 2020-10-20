package l3;

import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        Person custom = new Person(name, age);
        System.out.println("custom.name = " + custom.name);
        System.out.println("custom.age = " + custom.age);

        Person initPerson = new Person("Ivan", 19);
        initPerson.name = "Pjotr";
        System.out.println(initPerson.name + " is " + initPerson.age + " years old");

        Person defaultPerson = new Person("and", 77);
        System.out.println(defaultPerson.name + " is " + defaultPerson.age + " years old");

        Person pavel = new Person();
        pavel.age = 42;
        pavel.name = "Poma";

        Person nastya = new Person();
        nastya.age = 18;
        nastya.name = "Anastasya";

        Person kolya = new Person("Nikolai", 19);
        System.out.println(kolya.name + " and " + kolya.age + " years old");

        System.out.println(pavel.name + " is " + pavel.age + " years old");
        System.out.println(nastya.name + " is " + nastya.age + " years old");
    }
}
