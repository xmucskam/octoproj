public class Main {
    public static void main(String[] args) {
        Individual person = new Individual("Danie", "Melo", 30);
        person.getInfo();

        Student student = new Student("12654", "Makr", "Mucska", 21);
        student.getInfo();
        student.study();


        Employee employee = new Employee("Peter", "Bor", 50);
        employee.getInfo();
    }
}
