public class Main {
    public static void main(String[] args) {
        Individual person = new Individual("Alice", "Johnson", 30);
        person.getInfo();


        Student student = new Student("S12345", "Bob", "Smith", 20);
        student.getInfo();
        student.study();


        Employee employee = new Employee("Charlie", "Brown", 50);
        employee.getInfo();
    }
}
