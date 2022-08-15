package lessonFive;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Кулаков И.Б.", "Охранник", "15kulakov@box.net", "89190102030", 40000, 35 );
        Worker worker2 = new Worker("Иванов С.Ю.", "Художник", "ivanov.ne.ivanov@in.gde", "89990908077", 48000, 39);
        Worker worker3 = new Worker("Смирнов А.Р.", "Садовник", "ars790@mu.ru", "89010011087", 45500, 41);
        Worker worker4 = new Worker("Харитонов В.Е.","Бухгалтер", "hariton1111@gav.rr", "89554432233", 49000, 49);
        Worker worker5 = new Worker("Шаров А.Т.", "Водитель", "sharik_buldogov@da.net", "89308883377", 51000, 48);

        //worker1.printInfo();
        //worker2.printInfo();

        Worker[] workers = {worker1, worker2, worker3, worker4, worker5};
        for (Worker worker: workers){
            //worker.printInfo();
            worker.getAge();
            if (worker.getAge()>40){
                worker.printInfo();
            }

        }
    }

}
