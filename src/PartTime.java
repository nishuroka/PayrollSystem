public abstract class PartTime extends Employee {
    private double rate;
    private int hoursWorked;

    public PartTime(String name, int age, int deptNo, Vehicle vehicle, double rate, int hoursWorked) {
        super(name, age, deptNo, vehicle);
        this.rate=rate;
        this.hoursWorked=hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "rate=" + rate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
