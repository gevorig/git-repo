package lessonEight;

public class RunRoad implements Barrier{
    private int distance;

    public RunRoad(int distance) {
        this.distance = distance;
    }
    @Override
    public boolean come(Family family){
        return family.run(distance);
    }
}
