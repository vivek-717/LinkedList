package LinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(20);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(3);
        list.insertLast(32);
        list.insertLast(72);
        list.insertLast(21);
        list.insertLast(92);
//        list.display();
//        list.insertEle(23,0);
//        list.display();
//        list.deleteLast();
//        list.display();
//        System.out.println(list.deleteEle(21));
//        list.display();
//        System.out.println(list.deleteLast());
        list.display();
//        list.insertEle(23,6);
//        DLL list2 = new DLL();
        System.out.println(list.deleteEle(92));
        list.display();
//        LL list1 = new LL();
//        list1.deleteLast();





    }

}
