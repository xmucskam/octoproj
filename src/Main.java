public class Main {
    public static void main(String[] args) {
        Individual person = new Individual("Mark", 30);
        person.introduce();

        Student student = new Student("Daniel", 20, "Computer Science");
        student.introduce();
        student.study();
    }
}
