package lessonSix;

public abstract class Animals extends Object {
    protected String nickname;
    private int run;
    private String whatAnimal;

    public Animals(String nickname, int run, String whatAnimal){
        this.nickname = nickname;
        this.run = run;
        this.whatAnimal = whatAnimal;
    }

    public String getNickname() {return nickname;}

    @Override
    public String toString() {
        return String.format("%s %s пробежал %d метров%n",whatAnimal, nickname, run);
    }
    public void printInfo() { System.out.println(this); }
    public abstract void doAction();
}
