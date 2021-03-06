package lab.oder_system;

import java.util.Set;

public class ServiceCenter {

    private Set<Food> catalog = new DataCenter().getCatalog();
//根據no 尋找Food

    public Food getFoodByNo(int no) {
        return catalog.stream()
                .filter(f -> f.getNo() == no)
                .findFirst()
                .get();
    }

//檢視Catalong
    public void princtalog() {
        System.out.println("訂單列表");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("｜編號｜　品名　｜尺寸 ｜價格｜");

        for (Food food : catalog) {
            System.out.printf("｜%2d　｜ %s｜ %c ｜ %3d｜\n",
                    food.getNo(), food.getName(), food.getSize(), food.getPrice());

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
//檢視系統menu
    public void menu(){
        System.out.println("系統項目");
        System.out.println("----------------------");
        System.out.println("1.檢視Catalog");
               System.out.println("2. 新增訂單餐點");
        System.out.println("3. 查詢訂單餐點");
        System.out.println("4. 取消訂單餐點");
        System.out.println("5. 刪除全部訂單");
        System.out.println("6. 結帳");
        System.out.println("0. 離開");
        System.out.println("----------------------");
    
    }
}
