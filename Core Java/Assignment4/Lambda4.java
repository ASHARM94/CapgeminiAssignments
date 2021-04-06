import java.util.ArrayList;

public class Lambda4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");

        list.removeIf((i) -> ((i.length())%2!=0));
        System.out.println(list);
    }
}
