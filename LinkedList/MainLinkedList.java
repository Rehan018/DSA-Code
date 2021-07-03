package LinkedList;

public class MainLinkedList <E>{
    Node<E> head;
   public void add(E data){
        Node<E> toAdd=new Node<E>(data);
       if(isEmpty()){
           head=toAdd;
           return;
       }
        Node<E> temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }
    public boolean isEmpty(){
       return head==null;
    }
    void print(){
        Node<E>  temp=head;
        while (temp !=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public E removelast() throws Exception {
       Node<E> temp = head;
        if(temp==null){
            throw new Exception("con't remove last element  from empty list: ");
        }
        //--head have one node--//
        if(temp.next==null){
            Node<E> toremove=head;
            head=null;
            return  toremove.data;
        }
        while (temp.next.next!=null){
            temp=temp.next;
        }
        Node<E>  toreomv=temp.next;
        temp.next=null;
        return  toreomv.data;
    }
    public E getlast() throws Exception{
        Node<E> temp = head;
        if(temp==null){
            throw new Exception("con't peek last element last element from empty list: ");
        }
        //--head have one node--//

        while (temp.next!=null){
            temp=temp.next;
        }
      return temp.data;
    }
   public void insertFirst(E val){
        Node<E> pos=new Node(head.data);
        pos.data=val;
        pos.next= head.next;
        head.data= pos.data;


    }
   public static  class Node<E>{
       public E data;
       public Node next;
        public Node(E data){
            this.data= (E) data;
            next=null;
        }
    }
}
