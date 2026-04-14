public class Methods {
    public static void main(String[] args) {
        
        String text="Hello World!";
        System.out.println(text.length());

        HelloPrintArg("Darshu");
        HelloPrint();
    }
public static void HelloPrintArg(String name){
    System.out.println("Hello dear!!"+name);
}
public static void HelloPrint(){
    System.out.println("Hello dear!!");
}
}
