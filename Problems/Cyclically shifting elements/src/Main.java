import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] a = new int[arraySize];
        int[] b = new int[arraySize];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < (a.length - 1); i++) {
            b[i + 1] = a[i];
        }

        b[0] = a[a.length - 1];

        for (int i : b
        ) {
            System.out.print(i + " ");
        }
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//        }
    }
}