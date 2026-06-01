import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Ram");
        list.add("Sham");
        list.add("Mohan");

        list.remove(1);

        System.out.println(list);
    }
}