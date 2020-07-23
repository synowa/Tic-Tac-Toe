import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int m = scanner.nextInt();
        int n = scanner.nextInt();


        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        int l = scanner.nextInt();

        for (int i = 0; i < m; i++) { // i to m not to n, cause u need to change values in every row in given column
            int value = array[i][k]; // keep the value to not lose it in the next line
            array[i][k] = array[i][l];
            array[i][l] = value;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}