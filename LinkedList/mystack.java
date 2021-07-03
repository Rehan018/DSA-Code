package LinkedList;

public class mystack<E> {
    private MainLinkedList<E> stack=new MainLinkedList<E>();
    void push(E e){
        stack.add(e);
    }
    E pop() throws Exception{
        if(stack.isEmpty()){
            throw new Exception("can't pop from empty slot: ");
        }
        return stack.removelast();
    }
    E peek() throws Exception{
        if(stack.isEmpty()){
            throw new Exception("peeking can't from empty slot");
        }
        return stack.getlast();
    }
}
