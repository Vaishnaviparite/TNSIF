package DaySix.staticblockmathod;

public class MyclassDemo {
    public static void main(String[] args) {

        MyClass o1 = new MyClass();
        System.out.println(o1);

        MyClass.display(); // static method

        MyClass o2 = new MyClass();
        System.out.println(o2);
        MyClass.display();

    }

}
