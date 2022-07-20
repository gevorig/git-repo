package lessonSix;

public abstract class Animals {
    protected String nickname;
    private int run;
    private String whatAnimal;

    protected final int dogMaxDistanceRun = 500;
    protected final int catMaxDistanceRun = 200;
    protected final int dogMaxDistanceSwim = 10;

    public Animals(String nickname, int run, String whatAnimal) {
        this.nickname = nickname;
        this.run = run;
        this.whatAnimal = whatAnimal;
    }

    public String getNickname() {
        return nickname;
    }
    /*public int getRun() {
        return run;
    }*/

    @Override
    public String toString() {

        return String.format("%s %s пробежал %d метров%n", whatAnimal, nickname, run);
    }

    public void printInfo() {
        if (run > dogMaxDistanceRun) {
            System.out.printf("Собака %s столько не пробежит! %n%n", nickname);
        } else if (run > catMaxDistanceRun) {
            System.out.printf("Кошка %s столько не пробежит! %n%n", nickname);

        } else {
            System.out.println(this);

        }
    }
    public abstract void doAction ();

}
