package deque;

import java.util.ArrayDeque;

public class MainClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> adeque=new ArrayDeque<>();
        adeque.addFirst(75);
        adeque.addFirst(76);
        adeque.addFirst(25);
        adeque.addFirst(71);
        adeque.pop();
        int dikh=adeque.peek();
        System.out.println(dikh);
    }
}
