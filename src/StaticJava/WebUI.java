package StaticJava;

public class WebUI {
    public static String email = "admin@example.com";
    public static String phone = "123456";

    public static void openURL (String url){
        System.out.println(url);
    }

    public static void clickElement (String elementName) {
        System.out.println("Click element "+ elementName);
    }

    public static void setText (String text){
        System.out.println(("Set text: " + text));
    }
    public static String getElementText (String elementName){
        return "text";
    }

    public static void main(String[]args) {
        openURL("https://anhtester.com/lesson/selenium-java-bai-1-java-basic");
        setText(email);
        setText(phone);
        clickElement("Login button");
    }
}
