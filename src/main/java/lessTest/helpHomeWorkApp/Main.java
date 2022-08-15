package lessTest.helpHomeWorkApp;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"2", "33", "34", "54"},
                {"2", "33", "04", "54"},
                {"2", "38", "34", "54"},
                {"21", "33", "64", "23"},
        };

        try {
            System.out.println("Сумма всех ячеек массива = " + checkArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static int checkArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        checkArraySize(array, 4, 4);
        return checkArrayData(array);
    }

    private static int checkArrayData(String[][] array) throws MyArrayDataException {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ячейка массива [" + (i + 1) + "][" + (j + 1) + "] содержит недопустимые данные. Допустимы только числа.");
                }
            }
        }

        return sum;
    }

    private static void checkArraySize(String[][] array, int row, int col) throws MyArraySizeException {
        if (array.length == row)
            for (int i = 0; i < array.length; i++) {
                if (array[i].length != col) break;
                if (i == array.length - 1) return;
            }

        throw new MyArraySizeException("Размер массива должен быть [" + row + "][" + col + "]");
    }
}
/**
 * 0 Создать класс исключения MyArraySizeException и MyArrayDataException
 * 1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
 * подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 * 2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
 * просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
 * ячейке лежит символ или текст вместо числа), должно быть брошено исключение
 * MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 * 3 В методе main() вызвать полученный метод, обработать возможные исключения
 * MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */
