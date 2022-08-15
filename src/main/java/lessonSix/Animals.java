package lessonSix;

public abstract class Animals {
    protected String nickname;
    private int run;

    private String whatAnimal;

    public Animals(String nickname, int run, String whatAnimal) {
        this.nickname = nickname;
        this.run = run;
        this.whatAnimal = whatAnimal;
    }

    public String toString(){
        return String.format("%s %s пробежал %d метров%n%n", whatAnimal, nickname, run);
    }

    public String getNickname() { return nickname; }

    public int getRun() { return run; }
    public String getWhatAnimal() {
        return whatAnimal;
    }

    public abstract void doRun ();
    public abstract void doSwim ();

}
