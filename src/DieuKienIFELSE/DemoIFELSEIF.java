package DieuKienIFELSE;

public class DemoIFELSEIF {
    public static void main(String [] args){
        double dtb = 9.1;

        if (dtb > 10 || dtb < 0) {
            System.out.println("Invalid");
        } else {
            if (dtb >= 8){
                System.out.println("Loại Giỏi");
            } else if (dtb < 8 && dtb >= 6.5){
                System.out.println("Loại Khá");
            } else if (dtb < 6.5 && dtb >= 5){
                System.out.println("Loại TB");
            } else if (dtb < 5 && dtb >= 3.5){
                System.out.println("Loại Yếu");
            } else{
                System.out.println("Ở lại lớp");
            }
        }
    }
}
