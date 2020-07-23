import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] arrayElements = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayElements[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int thereIs = 0;

        for (int i = 0; i < arraySize - 1; i++) {
            if (arrayElements[i] == n && arrayElements[i + 1] == m
                    || arrayElements[i] == m && arrayElements[i + 1] == n) {
                thereIs++;
            }
        }
        System.out.println(thereIs < 1);
    }
}