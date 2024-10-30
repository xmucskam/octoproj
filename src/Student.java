public class Student extends Individual {
    private String studentId;

    public Student(String studentId, String name, String surname, int age) {
        super(name, surname, age);  // Call the superclass (Individual) constructor
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;  // Getter for student ID
    }

    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + name + " " + surname + ", I am " + age + " years old, and my student ID is " + studentId + ".");
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}
