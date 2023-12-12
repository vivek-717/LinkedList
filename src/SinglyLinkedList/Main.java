package SinglyLinkedList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
//        list.insertFirst(2);
//        list.insertFirst(5);
//        list.insertFirst(18);
//        list.insertFirst(20);
//        list.insertFirst(23);
//        list.display();
//        list.insert(40,2);
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        list.delete(2);
//        list.display();
//        list.find (18);
        list.insertFirst(2);
        list.insertFirst(5);
        list.insertFirst(18);
        list.insertFirst(20);
        list.insertFirst(23);
        list.insertLast(50);
        list.insertLast(30);
        list.insertLast(15);
        list.display();
////        list.insertAfter(12,11);
////        list.display();
//        list.deleteFirst();
//        list.display();
//        list.deleteFirst();
//        list.deleteLast();
//        list.display();
        System.out.println(list.delete(50));
        list.display();


    }

}
