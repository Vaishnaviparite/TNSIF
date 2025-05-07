package DayTen;

public class Driver {
    public static void main(String[] args) {

        int n = 10;
        int a[];
        a = new int[n];

        ArrayOperations.printArray(a);

        for (int i = 0; i < a.length; i++) {
            a[i] = 5 * i;
        }

        ArrayOperations.printArray(a);

        int b[] = { 10, 20, 30, 40, 50, 60 };

        ArrayOperations.printArray(b);

        System.out.println("Sum of Array element is : " + ArrayOperations.getSum(b));
        System.out.println("Sum of Array element is : " + ArrayOperations.getSum(2, 7));

        b[2] = 999;

        b[20] = 10;
        ArrayOperations.printArray(b);

        System.out.println("Odd Numbers : " + ArrayOperations.getOddCount(b) + "\t Even Numbers : " +
                ArrayOperations.getEvenCount(b));
    }

}
