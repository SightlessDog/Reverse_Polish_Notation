package stack;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push("123");
        list.push("124");
        list.push("125");

        System.out.println(list.pop());
        System.out.println("===========");
        list.toString();
        System.out.println("============");

        list.pop();
        list.toString();
        System.out.println("======");

        PostFIx postfix = new PostFIx() ;
        postfix.infixToPostfix("1+2-3");

        }
}
