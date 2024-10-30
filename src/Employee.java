public class Employee implements Worker {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is working on their tasks.");
    }
}
