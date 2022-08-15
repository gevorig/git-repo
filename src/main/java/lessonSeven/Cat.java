package lessonSeven;

public class Cat {
    private String name;
    private int appetite;
    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        System.out.println("еды стало на " + appetite + " меньше");
    }
    public String getName() { return name; }
    public int getAppetite() { return appetite; }
}
