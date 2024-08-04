package VongLapFOR;

public class ForCaiTien {
    public static void main(String[] args) {
        int arr[] = {40, 50, 12, 23, 44, 56, 78};
        System.out.println(arr[0]);

        for (int i : arr) {
            if (i < 40 && i > 0) {
                System.out.println("Gia tri la "+ i);

            } else {
                System.out.println("Gia tri khac "+ i);
            }
        }

        String menu [] = {"Dashboard", "Customer", "Project", "Task"};
        for (String menuName : menu){
            System.out.println(menuName);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
