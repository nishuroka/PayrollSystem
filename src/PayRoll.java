import java.util.ArrayList;

public class PayRoll {
    public static void main(String args[]){
        ArrayList<Employee> empList = new ArrayList<>();
        fillData(empList);
        int total = 0;

        for(Employee emp:empList){
            System.out.println("");
            System.out.println("Name: "+emp.getName());
            System.out.println("Year of Birth:: "+emp.calcBirthYear());
            System.out.println("");

            if(emp.getVehicle() instanceof Motorcycle) {
                System.out.println("Employee has a MotorCycle");
                ((Motorcycle) emp.getVehicle()).printMyData();
            } else if(emp.getVehicle() instanceof Car) {
                System.out.println("Employee has a Car");
                ((Car) emp.getVehicle()).printMyData();
            } else {
                System.out.println("Employee has no Vehicle registered ");
            }

            System.out.println("");

            if(emp instanceof FixedBasedPartTime) {
                System.out.println("Employee is Part Time / Fixed Amt");
                ((FixedBasedPartTime) emp).printMyData();

            }  else if (emp instanceof CommissionBasedPartTime) {
                System.out.println("Employee is Part Time / Commissioned");
                ((CommissionBasedPartTime) emp).printMyData();
            }  else if (emp instanceof Intern) {
                System.out.println("Employee is Intern");
                ((Intern) emp).printMyData();
            }  else if (emp instanceof FullTime) {
                System.out.println("Employee is Full Time");
                ((FullTime) emp).printMyData();
            }

            total+=emp.calcEarnings();
            System.out.println("\n-------------------------------------------------------------------------------------");


        }
        System.out.println("\nTOTAL PAYROLL: "+total+" Canadian dollars\n");
    }

    private static void fillData(ArrayList<Employee> empList) {
        Car c1 = new Car("Ford","GH3443","Ford F-150",2018,15,false,"Pick-up");
        CommissionBasedPartTime emp1 = new CommissionBasedPartTime("Roch", 23,001, c1, 25, 4, 20);


        Motorcycle m1 = new Motorcycle("Honda","TR3232","Gold Wing",2021,48,"automatic","manual");
        FixedBasedPartTime emp2 = new FixedBasedPartTime("Hola", 30, 002,m1,45 ,35, 30);

        Car c2 = new Car("Tesla","TR3323", "Tesla Model 3", 2019,272,true,"slim");
        FullTime emp3 = new FullTime("Ronald", 30,003,c1, 50000, 400);

        Intern emp4 = new Intern("Gonsa", 24,  004, null, "Islington College",2);
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
    }
}
