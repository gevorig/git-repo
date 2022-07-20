package lessonSix;

public class Cat extends Animals{
    public Cat (String nickname, int run) {
        super(nickname, run, "Кошка");
    }

    @Override
    public void doAction() {
        System.out.printf("%s не умеет плавать  %n", super.getNickname());
    }
}
