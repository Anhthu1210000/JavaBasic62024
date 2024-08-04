package DieuKienIFELSE;

public class DemoIF {
    public static void main(String[] args) {
        int age = 20;
        String address = "Can Tho";
        String header = "Login CMS Page";

        // Đối với String, so sáng bằng là equals()
        // Đối với String, so sánh chứa là contains()
        if ((age > 18) && (address.equals("Can Tho"))) {
            System.out.println("Duoc di NVQS");
        }

        if (age == 18 && address.equals("Ha Noi")) {
            System.out.println("Duoc di NVQS");
        }

        if (header.contains("Login")){
            System.out.println("Đã đến được trang login");
        }


    }
}
