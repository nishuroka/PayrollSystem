public class FixedBasedPartTime extends PartTime implements IPrintable{
    private double fixedAmount;

    public FixedBasedPartTime(String name, int age, int deptNo, Vehicle vehicle, double rate, int hoursWorked, double fixedAmount) {
        super(name, age, deptNo, vehicle, rate, hoursWorked);
        this.fixedAmount = fixedAmount;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public String toString() {
        return "FixedBasedPartTime{" +
                "fixedAmount=" + fixedAmount +
                '}';
    }

    //a method to calculate the earnings of the employee
    @Override
    public double calcEarnings() {
        return (super.getRate() * super.getHoursWorked()) + fixedAmount;
    }

    @Override
    public void printMyData() {
        System.out.println(" - Rate per hour: "+super.getRate());
        System.out.println(" - Hours worked: "+super.getHoursWorked());
        System.out.println(" - Fixed Amount: "+fixedAmount);
        System.out.println(" - Earnings: "+calcEarnings());
    }
}

