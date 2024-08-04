package DieuKienIFELSE;

public class DemoIFELSE {
    public static void main(String[] args) {
        String gender = "Male";
        int age = 30;

        if ((gender.equals("Male")) || (age >= 30)) {
            System.out.println("Đi cuốc đất");
        } else {
            System.out.println("Đi hái rau");
        }
    }
}
