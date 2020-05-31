package stack;

public class LinkedList<E> implements Stack<E> {
    Node head;

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
        return newNode.value ;
    }

    @Override
    public boolean isEmpty() {
        return head == null ;
    }

    @Override
    public String toString() {
        Node node = head;
        while (node.next != null ) {
            node = node.next;
        }
        System.out.println(node.value);
        return node.value.toString() ;
    }
}