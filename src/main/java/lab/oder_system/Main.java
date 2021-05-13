package lab.oder_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Food> order = new ArrayList<>();
    private static DataCenter dc = new DataCenter();
    private static ServiceCenter sc = new ServiceCenter();
    private static boolean play = true;

    public static void main(String[] args) {
        while (play) {
            menu();
        }
    }

    public static void menu() {

        sc.menu();
        System.out.println("請輸入: ");
        Scanner scanner = new Scanner(System.in);
        int itemID = scanner.nextInt();
        switch (itemID) {
            case 1:
                sc.princtalog();
                break;

            case 2:
                System.out.println("請輸入No.");
                int addno = scanner.nextInt();
                // 在 order 集合中加入 Food
                Food food = sc.getFoodByNo(addno);
                order.add(food);

                break;

            case 3:
                for (int i = 0; i < order.size(); i++) {
                    System.out.printf("id: %d %s\n", i, order.get(i));
                }

                break;

            case 4:
                System.out.println("請輸入取消No: ");
                int cancelId = scanner.nextInt();
                order.remove(cancelId);
                break;

            case 5:
                order = new ArrayList<>();
                break;
            case 6:
                int sum = order.stream().mapToInt(Food::getPrice).sum();
                System.out.printf("結帳: %d\n", sum);
                play = false;
                break;
            case 0:
                play = false;
                break;
        }
    }
}
