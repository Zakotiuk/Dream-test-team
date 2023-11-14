package ThirdHW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 1));
        students.add(new Student("Olga", 2));
        students.add(new Student("Ira", 1));
        students.add(new Student("Alina", 3));
        
        Student.printStudents(students, 1);

        Collections.sort(students, new Student.ByCourse());
        System.err.println(students);

        Collections.sort(students, new Student.ByName());
        System.err.println(students);
    }
}
