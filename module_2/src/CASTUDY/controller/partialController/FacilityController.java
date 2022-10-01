package CASTUDY.controller.partialController;

import java.util.Scanner;

public class FacilityController {
//    private static final HouseController house = new HouseController();
//    private static final RoomController room = new RoomController();
//    private static final VillaController villa = new VillaController();
    public static void menuFacility() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Villa");
            System.out.println("2.Room");
            System.out.println("3.House");
            System.out.println("4.Exit");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    VillaController.menuVilla();
                    break;
                case 2:
                    RoomController.menuRoom();
                    break;
                case 3:
                    HouseController.menuHouse();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Vui lòng chọn từ 1 đến 4");
            }

        }
    }

}
