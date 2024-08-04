public class KieuDuLieu {

    public static void main (String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        //Toán tử số học
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println(a++); //a = a+1 => chỉ mới cộng lên nên vẫn = 10
        System.out.println(a); // a = 11 => đã cộng 1 từ dòng 10
        System.out.println("a = " + (a += b)); // a = 11 như dòng 10, a = a + b = 11+20 = 31

        // Toán tử so sánh và logic
        System.out.println("So sánh a > b " + (a > b)); // a=31 từ dòng 12, b=20
        System.out.println("So sánh a, b, c " + ((a > b) || (b < c)));

        System.out.println("So sánh và hoặc " +(((b > a) && (b > c)) || ((a > b) && (a > c))));
    }
}
