public class Main {
    public static void main(String[] args) {
        Employee worker = new Employee("Alice");
        worker.work();

        Manager manager = new Manager("Bob");
        manager.work();
        manager.manage();
    }
}
