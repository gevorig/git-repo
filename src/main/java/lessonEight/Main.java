package lessonEight;

public class Main {
    public static void main(String[] args) {
        Human valera = new Human("Валера");
        Cat bars = new Cat("Барс");
        Robot android = new Robot("Андроид");


        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);
        Wall wall3 = new Wall(3);

        RunRoad runRoad1 = new RunRoad(900);
        RunRoad runRoad2 = new RunRoad(750);
        RunRoad runRoad3 = new RunRoad(1450);

        Barrier[] barriers = {wall1,wall2,wall3,runRoad1,runRoad2,runRoad3};


        Family[] families = {valera, bars, android};

        for (Family creature : families) {
            for (Barrier barrier : barriers) {
                if (!barrier.come(creature)) break;
            }
        }



/*
        doRun(valera);
        doJump(valera);

        doRun(bars);
        doJump(bars);

        doRun(android);
        doJump(android);



*/

    }
/*    private static void doRun(DoAction run){run.run();}
    private static void doJump(DoAction jump){jump.jump();}*/
}



/*
        Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
        Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

        Создайте два класса: беговая дорожка и стена, при прохождении через которые,
        участники должны выполнять соответствующие действия (бежать или прыгать),
        результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

        Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

        * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
        Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
        Комментарий к ДЗ.

        Подумайте, какие из частей стоит вынести в интерфейс.
        Желательно сделать так, чтобы сами классы ничего не знали друг про друга.
        Взаимодействие должно быть на уровне интерфейсов (интерфейс общается с интерфейсом).
        Избегайте проверок instanceOf и кастинга классов.
        Постарайтесь сделать программу так, чтобы в мейне были только создания объектов,
        создание массивов и проход по ним.
        Логику того, какой участник и что преодолел, лучше туда не добавлять.*/
