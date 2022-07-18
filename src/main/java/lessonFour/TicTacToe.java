package lessonFour;
import java.util.Random;
import java.util.Scanner;
public class TicTacToe {
    private static final int SIZE = 3; //  размер поля
    private static final char DOT_EMPTY = '•'; // пустая клетка
    private static final char DOT_PLAYER = 'X'; // символ первого игрока
    private static final char DOT_PC = 'O'; // символ второго игрока
    private static final char[][] MAP = new char[SIZE][SIZE];

    public static final String HEADER_FIRST_SYMBOL = "+";
    public static final String SPACE_MAP = "  ";
    private static Random random = new Random();
    private static Scanner in = new Scanner(System.in);

    private static int turnsCount;

    public static void main(String[] args){
        initMap();
        printMap();
        playGame();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;   // проставляем символ " • " во все поля карты
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        while (true){
            playerTurn();
            printMap();
            if (checkEnd(DOT_PLAYER)) {
                break;
            }
            aiTurn();
            printMap();
            if (checkEnd(DOT_PC)) {
                break;
            }
        }
    }
    private static boolean isCellFree(int rowNumber, int columnNumber) { // проверка пустоты ячейки
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }
    private static void aiTurn() {                     // ход компьютера
        System.out.println("\nХод соперника!");
        int rowNumber;
        int columnNumber;
        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellFree(rowNumber, columnNumber));
        MAP[rowNumber][columnNumber] = DOT_PC;
        turnsCount++;
    }

    private static boolean checkEnd(char symbol) {      //  проверка на конец игры
        if (checkWin(symbol)) {
            if (symbol == DOT_PLAYER) {
                System.out.println("Победа!");
            } else {
                System.out.println("Поражение!");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {         // проверка на ничью
        return turnsCount >= SIZE*SIZE;
    }

    private static boolean checkWin(char symbol) {
        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) {
            return true;
        }
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }

        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) {
            return true;
        }
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) {
            return true;
        }

        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][1] == symbol && MAP[2][0] == symbol) {
            return true;
        }

        return false;
    }

    private static void playerTurn(){           // ход игрока
        System.out.println("\nХод игрока!");

        int rowNumber;
        int columnNumber;

        System.out.println("Введите строку: ");
        rowNumber = in.nextInt() - 1;

        System.out.println("Введите столбец: ");
        columnNumber = in.nextInt() - 1;

        MAP[rowNumber][columnNumber] = DOT_PLAYER;
        turnsCount++;

    }
}
