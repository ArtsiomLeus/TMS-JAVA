package lesson15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Германия");
        list.addFirst("Италия");
        list.addLast("Англия");
        list.addLast("Нидерланды");
        System.out.println(list);

        list.remove("Италия");
        list.remove("Нидерланды");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());


    }
}
