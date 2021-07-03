package deque;

public class ArrayDeque {
    public static void main(String[] args) {
        DoublyLinedList<Integer>  dub=new DoublyLinedList<>();
        dub.addtohead(75);
        dub.addtotail(85);
        dub.addtohead(79);
        dub.addtotail(32);
        dub.printhead();

    }

}
