import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] elements = new int[n][m];
        int max = Integer.MIN_VALUE;
        int maxI = 0;
        int maxJ = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                elements[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (elements[i][j] > max) {
                    max = elements[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println(maxI + " " + maxJ);
    }
}
