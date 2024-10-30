public class Main {
    public static void main(String[] args) {

        Individual person = new Individual("Mark", "M", 22);
        person.introduce();

        Student student = new Student("120345", "Daniel", "Melo", 21);
        student.introduce();
        student.study();

        Employee employee = new Employee("Doe", "John", 50);
        employee.introduce();
    }
}