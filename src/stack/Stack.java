package stack;

public interface Stack<E> {

    public boolean isEmpty();

    public void push(Object value) throws Overflow;

    public Object top() throws Underflow;

    public Object pop() throws Underflow;

}
