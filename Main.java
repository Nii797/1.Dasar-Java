import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person2 person = new Person2("Soni", "Hidayatulloh", 23, 1.6, 5.0);

        // System.out.println(person.fullName());
        // System.out.println(person.age);
        // System.out.println(person.height);
        // System.out.println(person.weight);
        // System.out.println(person.bmi());

        person.printData();
    }

}

// ini adalah instance dan bisa dibilang menempatkan instance pada Variabel
// Person person1 = new Person();
// Person person2 = new Person();

// person1.hello();
// person2.hello();

// Field Instance
// Person person1 = new Person("Soni");
// person1.hello();

// Person person2 = new Person("Ririn");
// person2.hello();

// person1.hello();
// System.out.println(person1.name);
// person2.hello();
// System.out.println(person2.name);