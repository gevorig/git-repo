package lessTest;

import java.util.Random;
import java.util.Scanner;

public class nards {
    private static final int boardSize = 20;
    private static final int chips = 15;
    private static String empty = " _ ";
    private static String[] map = new String[boardSize];
    private static Scanner in = new Scanner(System.in);
    private static Random random = new Random();



    public static void main(String[] args) {
        initMap();
        printMap();
    }

    private static void initMap() {
        for (int i = 0; i < boardSize; i++) {
            map[i] = empty;
        }
    }

    private static void printMap() {
        for (int i = 0; i < boardSize; i++) {

            System.out.print(map[i]+" ");

        }
    }
}
