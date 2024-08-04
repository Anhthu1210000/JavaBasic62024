package Arrays;

public class DemoMang2 {
    public static void main(String[] args) {

        //Khai báo và gán giá trị cho mảng
        int number2[] = {5, 7, 10, 20, 30, 40, 50, 60, 70, 80};

        number2[0] = 10;
        number2[1] = 20;
        number2[2] = 30;
        number2[3] = 40;
        number2[4] = 50;

        System.out.println("Length: " + number2.length);

        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }

        String dataCustomer[] = {"Hoa", "Hồng", "Huệ"};
        System.out.println(dataCustomer[0]); //Test lần 1
        System.out.println(dataCustomer[1]); //Test lần 2
        System.out.println(dataCustomer[2]); //Test lần 3

        System.out.println("++++++++++++++++");

        boolean check = true;
//        for (int i = 0; i < dataCustomer.length; i++) {
//            if (dataCustomer[i].contains("Quân")){
//                System.out.println("Có bạn Quân");
//                break;
//            } else {
//                System.out.println("Không có mặt");
//                break;
//            }
//        }

        for (int i = 0; i < dataCustomer.length; i++) {
            if (dataCustomer[i].equals("Huệ")) {
                check = true;
                break;
            } else {
                check = false;
            }
        }

        if (check == true){
            System.out.println("Có bạn Huệ");
        } else {
            System.out.println("Không có mặt");
        }
    }
}
