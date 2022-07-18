package lessonThree;


public class HomeWorkApp3 {


    public static void main(String[] args) {

        testik();
        oneHundred();
        lessSix();
        quad();
        lenArr();
    }




    private static void testik() {


        int[] arr2 = new int[4];

        arr2[1] = 1;
        arr2[3] = 1;
        for ( int i = 0; i < arr2.length; i++){
            if(arr2[i] == 0 ) {
                arr2[i]++;
            } else arr2[i]--;
            System.out.println(arr2[i] + "\n");


        }

    }


    private static void oneHundred() {
        int[] arr3 = new int[100];
        int plusOne = 0;
        for (int i = 0; i < arr3.length; i++) {
            plusOne++;
            arr3[i] = plusOne;
            System.out.print(arr3[i] + " ");


        }
    }

    private static void lessSix() {
        int[] arr4 = new int[12];
        arr4[0] = 1;
        arr4[1] = 5;
        arr4[2] = 3;
        arr4[3] = 2;
        arr4[4] = 11;
        arr4[5] = 4;
        arr4[6] = 5;
        arr4[7] = 2;
        arr4[8] = 4;
        arr4[9] = 8;
        arr4[10] = 9;
        arr4[11] = 1;

        for (int i = 0; arr4.length > i; i++) {
            if (arr4[i] < 6) {
                arr4[i]*=2;

            }
            System.out.println("\n");
            System.out.println(arr4[i]);
        }

    }

    private static void quad() {
        int[][] quadArr = new int[5][5];

        for(int i = 0; i < quadArr.length; i++){
            for(int j = 0; j < quadArr[i].length; j++){
                if(i == j){
                    quadArr[i][j] += 1;
                }
                System.out.printf("%3d",quadArr[i][j]);
            }
            System.out.println();
        }


    }

    private static void lenArr() {
        int len = 5;
        int initialValue = 12;
        int[] arr5 = new int[len];
        for(int i = 0; i < arr5.length; i++ ){
            arr5[i] = initialValue;
            System.out.print(arr5[i] + " ");
        }
    }




}

