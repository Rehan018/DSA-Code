package Queue;
import LinkedList.MainLinkedList.Node;

import java.security.PublicKey;

public class MyQueue<E> {
    private Node<E> head, rear;
    public void enqueue(E e){
    Node<E> toadd=new Node<>(e);
    if(head==null){
        head=rear=toadd;
        return;
    }
    rear.next=toadd;
    rear=rear.next;
    }
    public E dequeue(){
        if(head==null){
            return null;
        }
    Node<E> temp=head;
    head=head.next;
    if(head==null)
        rear=null;
    return temp.data;
    }
}
