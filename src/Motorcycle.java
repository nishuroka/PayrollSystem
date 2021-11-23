public class Motorcycle extends Vehicle implements IPrintable{
    public String handle;
    public String gearType;

    public Motorcycle(String make, String plate, String model, int year, int mileage, String handle,
                      String gearType) {
        super(make, plate, model, year, mileage);
        this.handle=handle;
        this.gearType=gearType;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "handle='" + handle + '\'' +
                ", gearType='" + gearType + '\'' +
                '}';
    }

    @Override
    public void printMyData() {
        System.out.println(" - Make: "+super.getMake());
        System.out.println(" - Plate No.: "+super.getPlate());
        System.out.println(" - Handle: "+ handle);
        System.out.println(" - Gear Type: $"+ gearType);
    }
}
