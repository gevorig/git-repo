package lessonSix;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Dog dog = new Dog("Бобик", 501, 9);
        Cat cat = new Cat("Барсик", 175);
        Animals cat2 = new Cat("Марсик", 295);
        Animals dog2 = new Dog("Шарик", 198, 19);

        Animals[] animalss = {dog,cat,cat2,dog2};
        for (int i = 0; i < animalss.length; i++) {
            count = i + 1;
        }

        for (Animals animals: animalss) {
            animals.doRun();
            animals.doSwim();
            System.out.println("--------------------------------");
        }
        System.out.println("Всего животных: " + count);
    }
}
