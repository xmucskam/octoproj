public class Individual implements Person {
    protected String name;
    protected int age;

    public Individual(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Hello, I am" + name + " and I am " + age + " years old.");
    }
}
