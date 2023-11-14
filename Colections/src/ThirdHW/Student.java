package ThirdHW;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private Integer course;
    public Integer getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }
    public static void printStudents (List students, Integer course){
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getCourse() == course){
                System.err.println(student.getName());
            }
        }
    }
    public String toString() {
        return name + " course=" + course;
    }

    public static class ByName implements Comparator<Student>{
        public int compare(Student st1, Student st2){
            return st1.getName().compareTo(st2.getName());
        }
    }
    public static class ByCourse implements Comparator<Student>{
        public int compare(Student st1, Student st2){
            return st1.getCourse().compareTo(st2.getCourse());
        }
    }
}
