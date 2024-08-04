public class SwitchCase2 {

    //SwitchCase là so sánh bằng
    public static void main(String[] args) {

        String browser = " Chrome ";

        //Hàm toLowerCase()  để chuyển chuỗi về chữ thường
        //Hàm toUpperCase() để chuyển chuỗi về chữ in hoa
        //Hàm trim() để cắt bỏ khoảng trắng hai đầu của chuỗi


        switch  (browser.toLowerCase().trim()) {
            case "chrome":
                System.out.println("Chạy test với trình duyệt chrome");
                //ở case này, điều kiện đã THỎA nên các case sau sẽ được đi qua mà không cần kiểm tra
            case "edge":
                System.out.println("Chạy test với trình duyệt MS Edge");
            case "firefox":
                System.out.println("Chạy test với trình duyệt firefox");
//                break;
            default:
                System.out.println("Chạy test với trình duyệt CHROME mặc định");
        }
    }
}
