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
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " " + surname + " and I am " + age + " years old.");
    }
}