public class Employee extends Individual {
    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }


    public int yearsUntilRetirement() {
        int retirementAge = 62;
        return retirementAge - age > 0 ? retirementAge - age : 0; // Return 0 if already retired
    }

    @Override
    public void getInfo() {
        super.getInfo(); // Call the parent class getInfo
        System.out.println("Years until retirement: " + yearsUntilRetirement());
    }
}
