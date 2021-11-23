public class CommissionBasedPartTime extends PartTime implements  IPrintable{
    private double commission;

    public CommissionBasedPartTime(String name, int age, int deptNo, Vehicle vehicle, double rate, int hoursWorked,
                                   double commission) {
        super(name, age, deptNo, vehicle, rate, hoursWorked);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    //a method to calculate the earnings of the employee
    @Override
    public double calcEarnings() {
        return (super.getRate() * super.getHoursWorked()) + commission;
    }

    @Override
    public void printMyData(){
        System.out.println(" - Rate per hour: "+super.getRate());
        System.out.println(" - Hours worked: "+super.getHoursWorked());
        System.out.println(" - Commission: "+commission);
        System.out.println(" - Earnings: "+calcEarnings());
    }

}

