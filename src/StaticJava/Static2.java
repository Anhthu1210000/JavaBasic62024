package StaticJava;

public class Static2 {

    static int count = 0; // sẽ lấy bộ nhớ chỉ một lần

    Static2() {
        count++;
        System.out.println(count);
    }

    static void viDu (){
        int a = 5;
        int b = 10;
        int sum;
        sum = a + b;
    }


    public static void main(String args[]) {

        Static2 c1 = new Static2(); //Khởi tạo lần 1 => count = 1
        Static2 c2 = new Static2(); //Khởi tạo lần 2 => count = 2
        Static2 c3 = new Static2(); //Khởi tạo lần 3 => count = 3

    }
}
