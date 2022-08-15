package lessonNine;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "3", "1", "2"}, {"54", "4", "34", "4"}};
        try {
            System.out.println("сумма ячеек = " + checkArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {e.printStackTrace();}

    }

    public static int checkArray(String[][] array) throws MyArraySizeException, MyArrayDataException{
        checkArraySize(array,2,4);
        return checkArrayData(array);

    }

    private static int checkArrayData(String[][] array) throws MyArrayDataException{
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum=sum+Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("массив содержит недопустимые символы");
                }
            }
        }
        return  sum;
    }

    private static void checkArraySize(String[][] array, int row,int col) throws MyArraySizeException{
        if (array.length == row)
            for (int i = 0; i < array.length; i++) {
                if (array[i].length !=col) break;
                if (i == array.length-1) return;

            }
        throw new MyArraySizeException(String.format("Массив должен быть %d на %d", row, col));
    }
}
