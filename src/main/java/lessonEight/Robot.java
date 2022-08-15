package lessonEight;

public class Robot implements DoAction, Family{
    private int MAXRUN = 1350;
    private int MAXJUMP = 1;
    private String name;

    public Robot(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " бежит ");
    }
    public void jump() {
        System.out.println(name + " прыгает ");
    }
    @Override
    public boolean run(int distance) {
        if (MAXRUN>=distance){
            System.out.println(name+" пробежал дистанцию");
            return true;
        }
        System.out.println(name+" не пробежал дистанцию");
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (MAXJUMP>=height){
            System.out.println(name+" перепрыгнул стену");
            return true;
        }
        System.out.println(name+" не перепрыгнул стену");
        return false;
    }
}
