package lessonSeven;

public class Main {
    public static void main(String[] args) {
        Cat simba = new Cat("Симба", 19);
        Cat busik = new Cat("Бусик", 18);
        Cat tilda = new Cat("Тильда", 21);
        Cat marfa = new Cat("Марфа", 22);
        Cat tosia = new Cat("Тося", 17);
        Plate plate = new Plate(100);
        plate.info();

        Cat[] cats =  {simba,busik,tilda,marfa,tosia};
        for (int i = 0; i < cats.length; i++) {

        }

    }
}
