package lessonSix;

public class Dog extends Animals {
    private int swim;

    public Dog(String nickname, int run, int swim) {
        super(nickname, run, "Собака");
        this.swim = swim;

    }

    public void doAction() {

        if (swim <= dogMaxDistanceSwim){
        System.out.printf("%s проплывает %d метров %n", super.getNickname(), swim);
        } else System.out.printf("Собака столько не проплывёт! %n", super.getNickname());
    }
}