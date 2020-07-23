import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] seats = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seats[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int availableNeighboringSeats = 0;
            for (int j = 0; j < m; j++) {

                if (seats[i][j] == 0) {
                    availableNeighboringSeats++;
                } else {
                    availableNeighboringSeats = 0;
                }

                if (availableNeighboringSeats == k) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}