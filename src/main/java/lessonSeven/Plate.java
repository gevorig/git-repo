package lessonSeven;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void decreaseFood(int foodToDecrease) {
        food = food - foodToDecrease;
    }

    public void info() {
        System.out.println("в тарелке " + food + " еды");
    }
    public int getFood() {
        return food;}
}
