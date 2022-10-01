package CASTUDY.model.resort;

public class Villa extends Facility {
    private String roomStandard;
    private String swimmingArea;
    private double numberFloors;

    public Villa() {
    }

    public Villa(String serviceName, String usableArea, String rentalCosts, double maximumPeople, String rentalType) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
    }

    public Villa(String roomStandard, String swimmingArea, double numberFloors) {
        this.roomStandard = roomStandard;
        this.swimmingArea = swimmingArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String serviceName, String usableArea, String rentalCosts, double maximumPeople, String rentalType, String roomStandard, String swimmingArea, double numberFloors) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingArea = swimmingArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getSwimmingArea() {
        return swimmingArea;
    }

    public void setSwimmingArea(String swimmingArea) {
        this.swimmingArea = swimmingArea;
    }

    public double getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(double numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return super.toString()+"Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingArea='" + swimmingArea + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
