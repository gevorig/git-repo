package lessonSix;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        Dog dog = new Dog("Бобик", 201, 10);
        Cat cat = new Cat("Барсик", 175);
        Animals cat2 = new Cat("Марсик", 95);
        Animals dog2 = new Dog("Шарик", 198, 9);

        Animals[] animalss = {dog,cat,cat2,dog2};
        for (int i = 0; i < animalss.length; i++) {
            score = i + 1;
        }

        for (Animals animals: animalss) {
            animals.printInfo();
            animals.doAction();
            System.out.println("--------------------------------");
        }
        System.out.println("Всего животных: " + score);
    }
}
