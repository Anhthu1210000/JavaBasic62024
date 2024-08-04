package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoCollectionsSet {
    public static void main (String[] args){

        //Khai báo kiểu dữ liệu Set
        //Không lưu giá trị trùng lặp
        Set<String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Project");
        menu.add("Project");
        menu.add("Task");
        menu.add("Contracts");
        menu.add("Sales");

        System.out.println("Các phần tử của Set");
        System.out.print("\t" + menu + "\n");

        //duy
        // Show set through Iterator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }

        System.out.println("\n======================");
        // Show set through for-each
        System.out.println();
        for (String obj : menu) {
            System.out.print(obj + "\n");
        }
    }
}
