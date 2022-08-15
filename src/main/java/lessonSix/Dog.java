package lessonSix;

public class Dog extends Animals {
    private int swim;
    private final int dogMaxDistanceRun = 500;
    private final int dogMaxDistanceSwim = 10;

    public Dog(String nickname, int run, int swim) {
        super(nickname, run, "Собака");

        this.swim = swim;
    }

    public void doRun() {
        if (getRun() > dogMaxDistanceRun) {
            System.out.printf("Собака %s столько не пробежит! %n%n", nickname);
        } else {
            System.out.printf(toString());
        }
    }

    public void doSwim() {
        if (swim <= dogMaxDistanceSwim){
        System.out.printf("%s проплывает %d метров %n", getNickname(), swim);
        } else System.out.printf("Собака столько не проплывёт! %n");
    }
}