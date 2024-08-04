package StaticJava;

public class Static1 {
    int count = 0; //sẽ lấy bộ nhớ MỚI khi khởi tạo lại class hoặc gọi lại biến này

    Static1() {
        count++;
        System.out.println(count);
    }


    public static void main(String args[]) {

        Static1 c1 = new Static1(); //Khởi tạo lần 1 => count = 1
        Static1 c2 = new Static1(); //Khởi tạo lại thành lần 1 => count = 1
        Static1 c3 = new Static1(); //Khởi tạo lại thành lần 1 => count = 1
    }
}