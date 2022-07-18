package lessonTwo;

import java.util.concurrent.ThreadLocalRandom;



public class HomeWorkApp2 {
    public static void main(String[] args) {
        limitSumm();
        numb0();
        numRev();
        nStr();
        visokosny();
//        leapYear();

    }

    public static boolean limitSumm () {
        int a = 15;
        int b = 11;
        int result = a + b;
        System.out.println(result >= 10 && result <= 20);
        return false;
        /*этот метод я написал немного по-другому, но IDE мне предоложила его укоротить*/
    }

    private static void numb0() {
        int numb0 = ThreadLocalRandom.current().nextInt(-256,256);
        if(numb0 >= 0){
            System.out.println("число положительное!");
        } else if (numb0 < 0) {
            System.out.println("число отрицательное!");
        } else {
            System.out.println("неизвестное число!");
        }
    }

    private static boolean numRev() {
//      int nR = ThreadLocalRandom.current().nextInt(-256, 256);
        int nR = 1;
        System.out.println(nR < 0);
        return true;
    }

    private static void nStr() {
        final int LIM = 9;
        String bearStr = "Once a little brown bear..";
        for (int i = 0; i < LIM; i++) {
            System.out.println(bearStr);
        }


    }

    private static boolean visokosny() {
        int v = 2;
        System.out.println(v % 4 == 0 || v % 400 == 0 || v % 100 != 0);
            return true;

    }
}
//    private static boolean leapYear(int leap) {
//        int leap = 1904;
////        if (leap % 4  && leap % 400  || leap % 100 && leap % 400)
//            if (leap % 400 || leap % 4){
//            return true;
//        }
//
//    }
//с високосным годом пока не сделал, но позже думаю осилю!



