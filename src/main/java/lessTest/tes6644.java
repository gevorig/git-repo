package lessTest;
import java.util.Scanner;
import java.util.Random;
public class tes6644 {


    private static final int SIZE = 3;
    public static final String SPACE_MAP = " ";
    public static final String ZERO = "0";

    private static final char DOT_MAN = 'X';
    private static char EMPTI_POINT = '.';
    private static char DOT_COMP = '0';
    private static char[][] MAP = new char[SIZE][SIZE];
    private static Scanner in = new Scanner(System.in);
    private static Random random = new Random();


    public static void main(String[] args) {


        initMap();
        printMap();
        playGame();

    }


    private static void printMap() {
        printMapHader();
        printMapBody();
    }
    private static void printMapHader() {
        printMapNumber(ZERO + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i + 1 + SPACE_MAP);
        }
        System.out.println();
    }
    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i + 1 + SPACE_MAP);
            for (int j = 0; j < SIZE; j++) {
                printMapNumber(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(String i) {
        System.out.print(i);
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = EMPTI_POINT;
            }
        }
    }

    private static void playGame() {
        while (true) {
            manTurn();
            printMap();
            playGame();
            //checkEnd();

            // compTurn();
            //playGame();
            //checkEnd();
        }


    }

    private static void manTurn() {  // не работает
        System.out.println("Ход игрока");

        int rowNumber = in.nextInt() - 1;
        int columNumber = in.nextInt() - 1;

        MAP[rowNumber][columNumber] = DOT_MAN;
    }
}




//   ✘     ⓞ      ⚪       ⬯

