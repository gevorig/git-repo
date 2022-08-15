package lessonSix;

public class Cat extends Animals{

    private final int catMaxDistanceRun = 200;

    public Cat (String nickname, int run) {
        super(nickname, run, "Кошка");
    }
    public void doRun() {
        if (getRun() > catMaxDistanceRun) {
            System.out.printf("Кошка %s столько не пробежит! %n%n", nickname);
        } else {
            System.out.printf(toString());
        }
    }
    @Override
    public void doSwim() {

    }
}