package CASTUDY.controller.partialController;

import CASTUDY.sevice.IHouseSevice;
import CASTUDY.sevice.impl.HouseSevice;

import java.util.Scanner;

public class HouseController {
    public static final IHouseSevice ihouse = new HouseSevice();
    public static void menuHouse() {
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.println("1. Hiển thị danh sách House");
                System.out.println("2. Thêm mới House");
                System.out.println("3. Sửa House");
                System.out.println("4. Exit");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return;
                }
            }
        }

    }

