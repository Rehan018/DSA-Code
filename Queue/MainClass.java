package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {
    public static void main(String[] args) {
        Queue<Integer> Que=new LinkedList<>();
        Que.add(75);
        Que.add(78);
        Que.add(76);
        System.out.println(Que);
        System.out.println(Que.remove());
    }
}
