package Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {
        //Khai báo kiểu dữ liệu map
        Map<String, String> map = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();

        //Thêm dữ liệu
        map.put("language", "Java");
        map.put("framework", "testNG");
        map.put("library", "Selenium");

        map2.put(1, 111D);
        map2.put(2, 222D);

        //Update value
        map.put("library", "JavaScripts");

       // System.out.println("Map1: " + map);
       // System.out.println("Map2: " + map2);

        System.out.println(map.containsKey("Windows"));
        System.out.println(map.containsValue("Selenium"));
        map.remove("library");

        //Truy xuất giá trị theo từng key
        System.out.println(map.get("framework"));

        //Get hết giá trị của key và value
        for (Map.Entry<Integer, Double> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
