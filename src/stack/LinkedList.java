package stack;

public class LinkedList<E> implements Stack<E> {
    Node head;
    boolean started = false ;
    @Override
    public Object top(){
        Node node = head ;
        while(node.next!=null) {
            node = node.next;
        }
        return node.value ;
    }

    @Override
    public void push(Object value ) {
        Node node = new Node();
        node.value=value;
        node.next = null ;

        if (head == null) {
            head = node ;
        } else {
            Node n = head ;
            while (n.next!= null ){
                n =  n.next;
            }
            n.next = node ;
        }
    }

    @Override
    public Object pop()  {
        Node node = head ;
        Node n = head ;
        int i =0 ;
        while(node.next!=null) {
            node = node.next;
            i++;
        }
        for (int j = 0 ; j<i-1 ;j++ ) {
            n = n.next ;
        }
        Node newNode = node ;
        n.next = null ;
        node = null ;
        started = true ;
        return newNode.value ;
    }

    @Override
    public boolean isEmpty() {
        Node node = head ;
        if ((node.next == null) && (started)) {
            return true ;
        } else {
            return false ;
        }
    }

    @Override
    public String toString() {
        Node node = head;
        while (node.next != null ) {

            node = node.next;
        }
        System.out.println(node.value);

        return "" ;
    }
}