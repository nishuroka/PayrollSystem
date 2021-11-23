public class Car extends Vehicle implements IPrintable {
    boolean isAutomatic;
    public String bodyType;

    public Car(String make, String plate, String model, int year, int mileage,
               boolean isAutomatic, String bodyType) {
        super(make, plate, model, year, mileage);
        this.isAutomatic=isAutomatic ;
        this.bodyType=bodyType;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }


    @Override
    public String toString() {
        return "Car{" +
                "isAutomatic=" + isAutomatic +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }

    @Override
    public void printMyData(){
        System.out.println(" - Make: "+super.getMake());
        System.out.println(" - Plate : "+super.getPlate());
        System.out.println(" - Is Automatic: "+ isAutomatic);
        System.out.println(" - Body Type: "+bodyType);

    }

}
