public class Student extends Individual {
    private String studentId;

    public Student(String studentId, String name, String surname, int age) {
        super(name, surname, age);  // Call the superclass (Individual) constructor
        this.studentId = studentId;
    }

    @Override
    public void getInfo() {
        super.getInfo();  // Call the parent class getInfo
        System.out.println("Student ID: " + studentId);  // Display student ID
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}
