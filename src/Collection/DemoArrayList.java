package Collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main (String[] args){
        //Khai báo mảng arraylist
        List<String> menu = new ArrayList<>();
        //

        //thêm dữ liệu
        menu.add("Dashboard");
        menu.add("Customers");
        menu.add("Contracts");
        menu.add("Projects");
        menu.add("Customers");

        //Xóa dữ liệu
        //menu.remove(3);

        //Cập nhật dữ liệu
        menu.set(4,"Cost");
        //Ktra dữ liệu
        System.out.println(menu.contains("Dashboard"));

        //Get giá trị theo chỉ mục
        //Vị tr bắt đầu là 0
        System.out.println(menu.get(4));

        //Duyệt dữ liệu arraylist

        //Cách 1
//        for (int i = 0;i < menu.size(); i++){
//            System.out.println(menu.get(i));
//        }
//
//        System.out.println("++++++++++++");
//        //Cách 2
        int j = 0;
        for (String value: menu){
            System.out.println(menu.get(j));
            j++;
        }

        List<String> menu2 = new ArrayList<>();
        menu2.addAll(menu);//Thêm nguyên bộ data trong menu vào menu2

        for (int i = 0;i < menu2.size(); i++){
            System.out.println(menu2.get(i));
        }
    }
}
