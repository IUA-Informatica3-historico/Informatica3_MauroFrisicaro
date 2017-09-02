package Task2;

import static java.lang.System.*;

public class MainLinkList {
    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        out.println(list.toString());

        list.delete(0);
        out.println(list.toString());

//         list.delete(1);
//        out.println(list.toString());
    }
}
