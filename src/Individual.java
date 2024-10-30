public class Individual implements Person {
    protected String name;
    protected String surname;
    protected int age;

    public Individual(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public void getInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname + ", Age: " + age);
    }
}
