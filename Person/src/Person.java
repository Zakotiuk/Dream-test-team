import java.util.Scanner;

class Person {
    String name;
    int a;
    
    int birthYear;
    public Person(){
        this.name = "Viktoriia";
        this.birthYear = 2004;
    }
    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int age() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return currentYear - birthYear;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = scanner.nextLine();
        System.out.print("Enter the birth year: ");
        birthYear = scanner.nextInt();
    }
    public void output(){
        System.out.println(name + "'s age: " + age());
    }
    public void changeName(String newName) {
        name = newName;
    }
    public static void main(String[] args) throws Exception {
        Person person = new Person("Daria", 2004);
        System.out.println(person.getName() + "'s age: " + person.age());

        // person.input();
        // System.out.println(person.getName() + "'s age: " + person.age());
        person.changeName("Dash");
        person.output();
    }
}
