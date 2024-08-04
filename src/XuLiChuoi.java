public class XuLiChuoi {

    public static void main (String [] args) {
        String s1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        String s2 = "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";

        //Cắt chuỗi
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(6,11));
        //Ghép chuỗi
        System.out.println(s1 + " - " + s2);
        //Chuyển kiểu in hoa thường
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        //Xóa kí tự khoảng trắng 2 đầu
        String s3 = " Test Automation ";
        System.out.println(s3.trim());
        //Độ dài chuỗi
        System.out.println(s3.length());
        //Tìm kiếm kí tự
        System.out.println(s3.charAt(3));
        System.out.println(s1.indexOf("r"));
        //So sánh chuỗi
        //So sánh bằng
        String s4 = "Test Automation";
        String s5 = "Test automation";
        System.out.println(s3.equals(s4));
        System.out.println(s4.contains(s3));

        //So sánh nhưng bỏ qua in hoa in thường
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
