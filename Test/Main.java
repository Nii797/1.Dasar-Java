package Test;

public class Main {

    public static void main(String[] args) {

        Sepeda sepeda1 = new Sepeda("Pasific", "Putih", 0);
        System.out.println("【Info Sepeda】");
        sepeda1.Dataprint();
        System.out.println("----------------------------");
        sepeda1.run(10);

    }

}
