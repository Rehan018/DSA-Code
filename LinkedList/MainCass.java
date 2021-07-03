package LinkedList;

public class MainCass {
    public static void main(String[] args) throws Exception {
        MainLinkedList<Integer> main=new MainLinkedList();
        main.add(10);
        main.add(15);
        main.add(85);
        main.add(45);
        main.removelast();
        main.print();
    }
}
