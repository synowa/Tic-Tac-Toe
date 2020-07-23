import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] elements = new int[size];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt(); //to each element of the array it assigns a user's input;
        }

//        for (int element : elements) {
//            element = scanner.nextInt(); - u cannot assign anything to an array
//            using "for each" loop -> it is read only
//        }

        int sum = 0;
        for (int number : elements
        ) {
            sum += number;
        }

//        System.out.println(Arrays.toString(elements)); // prints an array;
        System.out.println(sum);
    }
}