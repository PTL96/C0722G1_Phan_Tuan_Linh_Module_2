package CASTUDY.model.resort;

public class House extends Facility {
    private String roomStandard;
    private String numberFloors;

    public House() {
    }

    public House(String serviceName, String usableArea, String rentalCosts, double maximumPeople, String rentalType) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
    }

    public House(String roomStandard, String numberFloors) {
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public House(String serviceName, String usableArea, String rentalCosts, double maximumPeople, String rentalType, String roomStandard, String numberFloors) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return super.toString()+ "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloors='" + numberFloors + '\'' +
                '}';
    }
}
