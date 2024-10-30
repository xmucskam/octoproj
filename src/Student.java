public class Student extends Individual {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);  // Call the superclass (Individual) constructor
        this.major = major;
    }

    public void study() {
        System.out.println(name + " is studying " + major + ".");
    }

    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + name + ", I am " + age + " years old, and I am majoring in " + major + ".");
    }
}
