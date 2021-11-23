public class Intern extends Employee implements IPrintable {
    private String schoolName;
    private int duration;

    public Intern(String name, int age, int deptNo, Vehicle vehicle, String schoolName, int duration) {
        super(name, age, deptNo, vehicle);
        this.schoolName = schoolName;
        this.duration = duration;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "schoolName='" + schoolName + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public void printMyData() {
        System.out.println(" - School Name: "+schoolName);
        System.out.println(" - Earnings: "+calcEarnings());
    }
}
