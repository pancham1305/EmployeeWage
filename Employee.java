import java.util.ArrayList;

public class Employee {

    private static int totalEmployees = 41;
    private static boolean[] Attendance = new boolean[totalEmployees + 1];
    private static int id = 1;
    String name;
    String pos;
    int eid = 0;

    public static void presentOrAbsent(Employee e, int a) {
        if (a == 1) {
            Attendance[e.eid] = true;
        } else {
            Attendance[e.eid] = false;
        }
    }

    Employee(String name, String pos) {
        this.name = name;
        this.pos = pos;
        this.eid = id;
        id++;
    }

    @Override
    public String toString() {
        return "Employee:\n" + "{\n{name:" + this.name + "},\n{pos:" + this.pos + "}\n}";
    }
}