public class SwitchCase1 {

    //SwitchCase là so sánh bằng
    public static void main(String[] args) {
        int number = -5;
        switch (number) {
            case 10:
                System.out.println("10");
                break; //thoát khỏi vòng switch
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }

        String browser = "chrome";
        switch  (browser) {
            case "chrome":
                System.out.println("Chạy test với trình duyệt chrome");
                break;
            case "edge":
                System.out.println("Chạy test với trình duyệt MS Edge");
                break;
            case "firefox":
                System.out.println("Chạy test với trình duyệt firefox");
                break;
            default:
                System.out.println("Chạy test với trình duyệt CHROME mặc định");
                break;
        }
    }
}
