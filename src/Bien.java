public class Bien {
    String BienCucBo = "Hello"; // Biến cục bộ -> nằm ngoài phương thức (Hàm), constructor hoặc block

    static String BienTinh = "AAA"; // Biến static -> nằm ngoài phương thức (Hàm), constructor hoặc block

    public void sayHello() {
        int n = 10;                     // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
        //System.out.println(BienTinh);
    }

    public static void main(String[] args) {
        Bien bien = new Bien();
        System.out.println(BienTinh);
        System.out.println(bien.BienCucBo);
        bien.sayHello();
        //System.out.println(BienCucBo); // Hiện lỗi vì BienCucBo kh phải là biến STATIC
        int number1 = 12345;
        int number2 = 789;

        String name1 = "Thu";
        String name2 = "Alex";
        //Gõ sout => System.out.println(value)
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(name1);
//        System.out.println(name2);
    }
}
