package lessonEight;

public class Wall implements Barrier{
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    @Override
    public boolean come(Family family){
        return family.jump(height);
    }
}
