package LinkedList;

public class LL{

    private Node head;

    public LL(){
        this.head = null;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void insertLast(int val) {
        Node temp = head;
        if (head == null) {
            insertFirst(val);
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        node.next = null;
    }

    public void insert(int val,int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        int size = size(head);
        if (index>size){
            System.out.println("Cannot be inserted in the index");
            return;
        }

        Node temp = head;
        for (int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node (val);
        node.next = temp.next;
        temp.next = node;

    }

    public int deleteFirst(){
        int value = head.value;
        if (head==null){
            System.out.println("Operation not possible");
            return -1;
        }
        head = head.next;
        return value;
    }

    public int deleteLast(){
        Node temp = head;
        Node prev = null;
        if (temp==null){
            System.out.println("Operation cannot be performed");
            return -1;
        }
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        int value = temp.value;
        prev.next = null;
        return value;


    }

    public int delete (int index){
        Node temp = head;
        Node prev = null;
        if (index==0){
            return deleteFirst();
        }
        int size = size(head);
        if (index==size-1){
            return deleteLast();
        }
        if (index>size){
            System.out.println("Operation not possible");
            return -1;
        }
        for (int i=1; i<=index; i++){
            prev = temp;
            temp=temp.next;
        }
        int value = temp.value;
        prev.next = temp.next;
        return value;

    }

    public int deleteEle(int after){
        Node temp = head;
        if (head==null){
            System.out.println("Operation is not possible");
            return -1;
        }
        int ans = -1;
        while (temp.next!=null && temp.next.next!=null){
            if (temp.value==after){
                ans = temp.next.value;
                temp.next = temp.next.next;
            }
            temp=temp.next;
        }
        if (temp.value == after){
            ans = temp.next.value;
            temp.next=null;
            return ans;
        }
        if (temp.next==null){
            return deleteLast();
        }
        return ans;

    }


    public void insertEle(int val, int after){
        Node node = new Node(val);
        Node temp = head;
        if (head==null){
            System.out.println("Element cannot be inserted");
            return;
        }
        while (temp.next!=null) {
            if (temp.value == after) {
                node.next = temp.next;
                temp.next = node;
                return;
            }
            temp=temp.next;
        }
        if (temp.value == after){
            insertLast(val);
            return;
        }
        System.out.println("Element cannot be inserted");
    }

    public int size(Node head){
        Node temp = head;
        int count = 0;
        while (temp.next!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display(){
        Node temp = head;
        if (head==null){
            System.out.println("END");
            return;
        }
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

