public class PhuongThuc {

    public double sum;
    public double res;

    //Hàm không trả về kết quả
    public void cong2So() {
        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println(sum);
    }

    //Hàm có trả về kết quả
    public double nhan2So() {
        int a = 5;
        int b = 10;
        res = a * b;
        return res;
    }

    //Hàm có tham số
    public void cong2So(int number1, int number2) {
        System.out.println("Hàm có hai tham số " + (number1 + number2));
    }

    public long nhan3So(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2So();
        //System.out.println(phuongThuc.cong2So()+5);

        phuongThuc.cong2So(20, 50);

        System.out.println(phuongThuc.nhan2So() + 10);
        System.out.println(phuongThuc.nhan3So(2,3,4)/5);

    }

}
