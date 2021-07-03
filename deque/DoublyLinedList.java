package deque;

public class DoublyLinedList<E> {
    Node<E> head, tail;
    public void addtohead(E data){
        Node<E> toadd=new Node<>(data);
        if(head==null){
            head=tail=toadd;
            return;
        }
        head.next=toadd;
        toadd.preves=head;
        head=toadd;
    }
    public void addtotail(E data){
        Node<E> toadd=new Node<>(data);
        if(tail==null){
            tail=toadd;
            return;
        }
        tail.preves=toadd;
        toadd.next=tail;
        tail=toadd;
    }
    public E removelast(){
        if(head==null){
            return null;
        }
        Node<E> toremove=tail;
        tail=tail.next;
        tail.preves=null;

        if(tail==null){
            head=tail;
        }
        return toremove.data;
    }
public E removefirst(){
        if(tail==null){
            return null;
        }
        Node<E> toremove=head;
        head=head.next;
        head.preves=null;

        if(head==null){
            tail=head;
        }
        return toremove.data;
}
void printhead(){
        Node<E> temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.preves;
        }
    System.out.println();
}


    public static class Node<E>{
        E data;
        Node<E> next, preves;
        public Node(E data){
            this.data=data;
            this.next=this.preves=null;
        }
    }
}
