import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] elements = new int[arraySize];
        int max = 0;

        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
            if (elements[i] > max) {
                max = elements[i];
            }
        }

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == max) {
                System.out.println(i);
                break;
            }
        }
    }
}