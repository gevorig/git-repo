package lessonFour;
import java.util.Scanner;
import java.util.Random;
public class myXO {
    private static final int MAP_SIZE = 3;
    private static final char DOT_EMPTY = '•';
    private static final char PLAYER_LABEL = '✘';
    private static final char PC_LABEL = '⬯';
    private static final String SPACE = "  ";

    private static final char MAP [][] = new char[MAP_SIZE][MAP_SIZE];

    private static Scanner scan = new Scanner(System.in);
    private static Random rand = new Random();
    private static int moveCount;

    public static void main(String[] args) {
        System.out.println("Игра КРЕСТИКИ-НОЛИКИ \n");
        initMap();
        playGame();
    }

    private static void initMap() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
                System.out.print(MAP[i][j] + SPACE);
            }
            System.out.println();
        }
    }

    private static void outputMap(){
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE);
            } System.out.println();
        }
    }

    private static void playGame(){
        do {
            playerMove();
            outputMap();
            pcMove();
            outputMap();
        } while (moveCount < (MAP_SIZE*MAP_SIZE));

    }

    private static void playerMove() {
        System.out.println("сделано ходов " + moveCount);
        System.out.println("\nХод игрока! ");
        int rowNumb;
        int columnNumb;
        do {
            System.out.print("Введите строку: ");
            rowNumb = scan.nextInt() - 1;
            System.out.print("Введите столбец: ");
            columnNumb = scan.nextInt() - 1;
        } while (MAP[rowNumb][columnNumb] != DOT_EMPTY);
        MAP[rowNumb][columnNumb] = PLAYER_LABEL;
        moveCount++;
    }

    private static void pcMove() {
        System.out.println("сделано ходов " + moveCount);
        System.out.println("\nХод соперника! ");
        int rowNumb;
        int columnNumb;
        do {
            rowNumb = rand.nextInt(MAP_SIZE);
            columnNumb = rand.nextInt(MAP_SIZE);
        } while (MAP[rowNumb][columnNumb] != DOT_EMPTY);
        MAP[rowNumb][columnNumb] = PC_LABEL;
        moveCount++;
    }

}
