package Prectics;

public class Prc_Linkedlist<E> {
    Node<E> head;
    public boolean isEmpty(){
        return head==null;
    }
    public void add(E data){
        Node<E> toadd=new Node<>(data);
        if(isEmpty()){
            head=toadd;
            return;                                 //---(2)
        }
        Node<E> temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=toadd;
    }
    //--for getlast--//
    public E getlast() throws Exception{
        Node<E> temp=head;
        if(temp==null){
            throw new Exception("can't peek last element from empty list: ");
        }
        while (temp.next!=null){
            temp=temp.next;
        }
        return temp.data;
    }
    void print(){
    Node<E> temp=head;
        System.out.print("[ ");
    while (temp!=null){
        System.out.print(temp.data+" ");//------(3)
        temp=temp.next;
    }
        System.out.print(" ]");
    }
public E removelast() throws Exception{
        Node<E> temp=head;
        //when node have't any element;
        if(temp==null){
            throw new Exception("can't remove last element from list: ");
        }
//--when node have one node;
    if(temp.next==null){
        Node<E> toremove=head;
        head=null;
        return toremove.data;
    }
    //--when node many chiled;
while (temp.next.next!=null){
    temp=temp.next;
}
    Node<E> toremove=temp.next;
    temp.next=null;
    return toremove.data;
}




    public static class Node<E>{
        //--E repersent types of data--//
        public E data;
        public Node next;        //----(1)
        public int  pos;
        public Node(E data){
            this.data=(E)data;
            next=null;
        }
    }
}
