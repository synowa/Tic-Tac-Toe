import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();

        int year = 0;
        double currentYear;
        double percentMultiplayer = 0.01;

        while(m < k) {
            currentYear = m * p * percentMultiplayer;
            m = m + currentYear;
            year++;
        }
        System.out.println(year);
    }
}