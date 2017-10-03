package Task2;

import static java.lang.System.*;

public class MainLinkList {
    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<Integer>();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        out.println(list.toString());

        try {
            list.delete(-2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println(list.toString());

        try {
            list.delete(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println(list.toString());
    }
}
