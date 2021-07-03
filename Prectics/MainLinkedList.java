package Prectics;

public class MainLinkedList {
    public static void main(String[] args) throws Exception {
        Prc_Linkedlist<Integer> node=new Prc_Linkedlist<>();
        node.add(45);
        node.add(67);
        node.add(25);
        node.add(85);
        node.print();

        System.out.println();
        node.print();
    }
}
