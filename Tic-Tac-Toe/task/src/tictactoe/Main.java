package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String symbols = "_________";

        System.out.println("---------");
        System.out.println("| " + symbols.charAt(0) + " " + symbols.charAt(1) + " " + symbols.charAt(2) + " |");
        System.out.println("| " + symbols.charAt(3) + " " + symbols.charAt(4) + " " + symbols.charAt(5) + " |");
        System.out.println("| " + symbols.charAt(6) + " " + symbols.charAt(7) + " " + symbols.charAt(8) + " |");
        System.out.println("---------");

//        System.out.println("---------");
//        System.out.println("|       | ");
//        System.out.println("|       |");
//        System.out.println("|       |");
//        System.out.println("---------");

        int firstCoordinateNum;
        int secondCoordinateNum;

        char place11 = symbols.charAt(6);
        char place21 = symbols.charAt(7);
        char place31 = symbols.charAt(8);
        char place12 = symbols.charAt(3);
        char place22 = symbols.charAt(4);
        char place32 = symbols.charAt(5);
        char place13 = symbols.charAt(0);
        char place23 = symbols.charAt(1);
        char place33 = symbols.charAt(2);

        char currentPlayer = 'X';
        while (true) {
            try {
                System.out.println("Enter the coordinates:");
                String[] pieces = scanner.nextLine().split(" ");
                firstCoordinateNum = Integer.parseInt(pieces[0]);
                secondCoordinateNum = Integer.parseInt(pieces[1]);

                if (firstCoordinateNum < 1 || firstCoordinateNum > 3 || secondCoordinateNum < 1 || secondCoordinateNum > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                if (firstCoordinateNum == 1 && secondCoordinateNum == 1 && place11 == '_') {
                    place11 = currentPlayer;
//                    break;
                } else if (firstCoordinateNum == 1 && secondCoordinateNum == 1 && (place11 == 'O' || place11 == 'X')) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (firstCoordinateNum == 2 && secondCoordinateNum == 1 && place21 == '_') {
                    place21 = currentPlayer;
//                    break;
                } else if (firstCoordinateNum == 2 && secondCoordinateNum == 1 && (place21 == 'O' || place21 == 'X')) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (firstCoordinateNum == 3 && secondCoordinateNum == 1 && place31 == '_') {
                    place31 = currentPlayer;
                } else if (firstCoordinateNum == 3 && secondCoordinateNum == 1 && (place31 == 'O' || place31 == 'X')) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (firstCoordinateNum == 1 && secondCoordinateNum == 2 && place12 == '_') {
                    place12 = currentPlayer;
                } else if (firstCoordinateNum == 1 && secondCoordinateNum == 2 && (place12 == 'O' || place12 == 'X')) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (firstCoordinateNum == 2 && secondCoordinateNum == 2 && place22 == '_') {
                    place22 = currentPlayer;
                } else if (firstCoordinateNum == 2 && secondCoordinateNum == 2 && (place22 == 'O' || place22 == 'X')) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (firstCoordinateNum == 3 && secondCoordinateNum == 2 && place32 == '_') {
                    place32 = currentPlayer;
                } else if (firstCoordinateNum == 3 && secondCoordinateNum == 2 && (place32 == 'O' || place32 == 'X')) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (firstCoordinateNum == 1 && secondCoordinateNum == 3 && place13 == '_') {
                    place13 = currentPlayer;
                } else if (firstCoordinateNum == 1 && secondCoordinateNum == 3 && (place13 == 'O' || place13 == 'X')) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (firstCoordinateNum == 2 && secondCoordinateNum == 3 && place23 == '_') {
                    place23 = currentPlayer;
                } else if (firstCoordinateNum == 2 && secondCoordinateNum == 3 && (place23 == 'O' || place23 == 'X')) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (firstCoordinateNum == 3 && secondCoordinateNum == 3 && place33 == '_') {
                    place33 = currentPlayer;
                } else if (firstCoordinateNum == 3 && secondCoordinateNum == 3 && (place33 == 'O' || place33 == 'X')) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
//                    break;

            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
                continue;
            }

        /*while(true) {
            scanner = new Scanner(System.in);
            try {
                System.out.println("Enter the coordinates:");
                firstCoordinateNum = scanner.nextInt();
                secondCoordinateNum = scanner.nextInt();
                break;
            } catch (NoSuchElementException e) {
                System.out.println("You should enter numbers!");
            } finally {
                scanner.close();
            }
        }*/

            System.out.println("---------");
            System.out.println("| " + place13 + " " + place23 + " " + place33 + " |");
            System.out.println("| " + place12 + " " + place22 + " " + place32 + " |");
            System.out.println("| " + place11 + " " + place21 + " " + place31 + " |");
            System.out.println("---------");


//        char[][] array = new char[3][3];
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                array[i][j] = symbols.charAt(3 * i + j);
//            }
//            System.out.println(Arrays.deepToString(array));
//        }

            int firstRow = check(place13, place23, place33);
            int secondRow = check(place12, place22, place32);
            int thirdRow = check(place11, place21, place31);
            int firstColumn = check(place13, place12, place11);
            int secondColumn = check(place23, place22, place21);
            int thirdColumn = check(place33, place32, place31);
            int firstDiagonal = check(place13, place22, place31);
            int secondDiagonal = check(place33, place22, place11);


            int winsO = 0;
            int[] results = {firstRow, secondRow, thirdRow, firstColumn,
                    secondColumn, thirdColumn, firstDiagonal, secondDiagonal};

            for (int i = 0; i < results.length; i++) {
                if (results[i] == -1) {
                    winsO++;
                }
            }

            int winsX = 0;
            for (int i = 0; i < results.length; i++) {
                if (results[i] == 1) {
                    winsX++;
                }
            }

            int howManyO = 0;
            int howManyX = 0;
            for (int i = 0; i < symbols.length(); i++) {
                char symbol = symbols.charAt(i);
                if (symbol == 'O') {
                    howManyO++;
                } else if (symbol == 'X') {
                    howManyX++;
                }
            }

            if ((winsO == 1 && winsX == 1) || Math.abs(howManyO - howManyX) >= 2) {
                System.out.println("Impossible");
                return;
            }
            if (winsO == 0 && winsX == 0 && (firstRow == 0 || secondRow == 0 || thirdRow == 0 || firstColumn == 0 ||
                    secondColumn == 0 || thirdColumn == 0 || firstDiagonal == 0 || secondDiagonal == 0)) {
                if (currentPlayer == 'X') {
                    currentPlayer = 'O';
                } else {
                    currentPlayer = 'X';
                }
            }

//            System.out.println("Game not finished");
//            return;
//                continue;


            if (firstRow == 2 && secondRow == 2 && thirdRow == 2 && firstColumn == 2 &&
                    secondColumn == 2 && thirdColumn == 2 && firstDiagonal == 2 && secondDiagonal == 2) {
                System.out.println("Draw");
                return;
            }

            if (winsO == 1) {
                System.out.println("O wins");
                return;
            }
            if (winsX == 1) {
                System.out.println("X wins");
                return;
            }
        }

    }


    private static int check(char a, char b, char c) {

        if (a == '_' || b == '_' || c == '_') {
            return 0; //"Game not finished"
        } else if (a == 'O' && b == 'O' && c == 'O') {
            return -1; // "O wins"
        } else if (a == 'X' && b == 'X' && c == 'X') {
            return 1; // "X wins"
        } else {
            return 2; // "Draw"
        }
    }
}
