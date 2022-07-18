package lessonFive;

public class Worker {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Worker(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    /*public Worker(String fullName) {
        this(fullName, "Без должности", "test@mail.ru", "89XXXXXXXXX", 0, 18);
    }*/
    void printInfo() {
        System.out.println(String.format("Сотрудник %s на должности %s, e-mail: %s, тел: %s, зарплата: %d, возраст: %d", fullName, position, email, phone, salary, age));
    }
}