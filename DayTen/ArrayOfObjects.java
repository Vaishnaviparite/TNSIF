package DayTen;

public class ArrayOfObjects {
    public static void main(String[] args) {

        Student[] arr;

        arr = new Student[5];

        arr[0] = new Student(1, "Soham");
        arr[1] = new Student(2, "Lisha");
        arr[2] = new Student(3, "Kirti");
        arr[3] = new Student(4, "Omkar");
        arr[4] = new Student(5, "Madhu");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : " + arr[6].getRollno() + " " + arr[6].getName());
        }

    }

}
