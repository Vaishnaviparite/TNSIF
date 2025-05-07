package DayEight.functionalinterfacedemo;

public class FunctionalInterface {
    public static void main(String[] args) {

        GreetClass obj = new GreetClass();
        obj.greetings();

        Greet g1 = () -> {
            System.out.println("Hello All");
            System.out.println("Lambda Expression");
        };

        g1.greetings();

    }

}
