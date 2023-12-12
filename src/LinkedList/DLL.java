package LinkedList;

public class DLL {
    private Node head;

    public DLL(){
        this.head = null;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        if (head!=null){
            head.prev = node;
        }
        node.prev = null;
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        if (head==null){
            insertFirst(val);
            return;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }

    public void insert(int val, int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        Node temp = head;
        for (int i=1; i<index; i++){
            temp =temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if (node.next!=null){
            node.next.prev = node;
        }
    }

    public void insertAfter(int val, int after){
        Node temp = get(after);
        if (temp==null){
            System.out.println("cannot be inserted");
            return;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if (node.next!=null){
            node.next.prev = node;
        }
    }

    public int deleteFirst(){
        int value = head.value;
        if (head!=null){
            head = head.next;
        }
        return value;
    }

    public int deleteLast(){
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        int value = temp.value;
        temp.prev.next = null;
        return value;
    }

    public int delete(int value){
        Node node = get(value);
        if (node==null){
            System.out.println("No such value to delete");
            return -1;
        }
        if (node == head){
            return deleteFirst();
        }
        Node temp = head;
        while (temp.next!=node){
            temp=temp.next;
        }
        int val = node.value;
        temp.next = node.next;
        if (node.next!=null){
            node.next.prev = temp;
        }
        return val;


    }
    public Node get(int value){
        Node temp = head;
        while (head!=null && temp.next!=null){
            if (temp.value==value){
                return temp;
            }
            temp=temp.next;

        }
        return null;
    }
    public void display(){
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in Reverse");
        while(last!=head){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println(head.value + " -> START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node (int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


}

