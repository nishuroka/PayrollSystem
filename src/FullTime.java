public class FullTime extends Employee implements IPrintable{
    private double salary;
    private double bonus;

    public FullTime(String name, int age, int deptNo, Vehicle vehicle,double salary, double bonus) {
        super(name, age, deptNo, vehicle);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    //a method to calculate earning of the employee
    @Override
    public double calcEarnings(){
        return salary + bonus;
    }

    @Override
    public void printMyData() {
        System.out.println(" - Salary per month: "+salary);
        System.out.println(" - Bonus: "+bonus);
        System.out.println(" - Earnings: "+calcEarnings());
    }

}
