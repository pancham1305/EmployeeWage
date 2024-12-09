import java.util.Random;

public class main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pancham", "SE");
        Random r = new Random();
        int a = r.nextInt(2);
        System.out.println(a);
        Employee.presentOrAbsent(e1, a);
    }
}
