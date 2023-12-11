package SinglyLinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if (tail== null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int value = head.val;
        head = head.next;
        if (head == null){
            tail  = null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int value = tail.val;
        Node secondLast = get(size-2);
        secondLast.next = null;
        tail = secondLast;
        return value;
    }

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node element = get(index-1);
        int value = element.next.val;
        element.next = element.next.next;
        return value;
    }

    public Node find(int value){
        Node temp = head;
        while (temp != null){
            if (temp.val == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public Node get(int index){
        Node temp = head;
        for (int i=1; i<=index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node (int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

}
