import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String planOfTheRoom = scanner.nextLine();

        switch (planOfTheRoom) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = 0.5 * (a + b + c);
                double triangularFloor = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(triangularFloor);
                break;
            case "rectangle":
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                double rectangularFloor = x * y;
                System.out.println(rectangularFloor);
                break;
            case "circle":
                double r = scanner.nextDouble();
                double roundFloor = 3.14 * r * r;
                System.out.println(roundFloor);
                break;
            default:
                System.out.println("error!");
                break;

        }
    }
}