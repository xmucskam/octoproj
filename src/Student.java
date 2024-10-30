public class Student extends Individual {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public void study() {
        System.out.println(name + " is studying " + major + ".");
    }

    @Override
    public void introduce() {
        System.out.println("My name is" + name + ", I am " + age + " yo, and I am majoring in " + major + ".");
    }
}
