package SinglyLinkedList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(18);
        list.insertFirst(20);
        list.insertFirst(23);
        list.display();
        list.insert(40,2);
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        list.delete(2);
        list.display();


    }

}
