package LinkedList;

public class DLL {
    private Node head;

    public DLL(){
        this.head = null;
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertFirst(int val){
            Node node = new Node(val);
            if (head == null){
                head = node;
                return;
            }
            node.next = head;
            head.prev = node;
            head = node;
    }

    public void insertLast(int val){
        if (head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public void insert (int val, int index){
        Node temp = head;
        if (temp==null){
            insertFirst(val);
            return;
        }
        int size = size(head);
        if (index>size){
            System.out.println("Index out of bound");
            return;
        }
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size-1){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        for (int i=1; i<index; i++){
            temp=temp.next;
        }
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;

    }

    public void insertEle(int val, int after){
        Node temp = head;
        if (temp==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        while(temp.next!=null){
            if (temp.value == after){
                node.next = temp.next;
                temp.next.prev = node;
                node.prev=temp;
                temp.next = node;
                return;
            }
            temp= temp.next;
        }
        if (temp.value==after){
            insertLast(val);
            return;
        }
        System.out.println("Given element not present in DLL");
    }

    public int deleteFirst(){
        if (head==null){
            System.out.println("No elements in DLL to delete");
            return -1;
        }
        int value = head.value;
        head = head.next;
        head.prev = null;
        return value;
    }

    public int deleteLast(){
        if (head==null){
            System.out.println("No elements in DLL to delete");
            return -1;
        }
        Node temp = head;
        Node prev = null;
        while (temp.next!=null){
            prev = temp;
            temp=temp.next;
        }
        int value = temp.value;
        prev.next = null;
        return value;
    }

    public int delete (int index){
        if (index==0){
            return deleteFirst();
        }
        int size = size(head);
        if (index == size-1){
            return deleteLast();
        }
        if (index>=size){
            System.out.println("Index Out of Bound");
            return -1;
        }
        Node temp = head;
        Node prev = null;
        for (int i=1; i<=index; i++){
            prev = temp;
            temp = temp.next;
        }
        int value = temp.value;
        prev.next = temp.next;
        temp.next.prev = prev;
        return value;
    }

    public int deleteEle (int after){
        if (head == null){
            System.out.println("No element in DLL to delete");
            return -1;
        }
        Node temp = head;
        while (temp.next!=null && temp.next.next!=null){
            if (temp.value==after){
                int value = temp.next.value;
                temp.next =temp.next.next;
                temp.next.next.prev = temp;
                return value;
            }
            temp = temp.next;
        }
        if (temp.value == after){
            return deleteLast();
        }
        System.out.println("Element cannot be deleted");
        return -1;

    }

    public int size (Node head){
        Node temp = head;
        if (temp == null){
            return 0;
        }
        int count = 1;
        while (temp.next!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public void display(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
    }



}

