package CASTUDY.model.resort;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, String usableArea, String rentalCosts, double maximumPeople, String rentalType) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, String usableArea, String rentalCosts, double maximumPeople, String rentalType, String freeService) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString()+ "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
