package PriortyQueue;

import java.util.PriorityQueue;

public class MainClass {
    public static void main(String[] args) {
        PriorityQueue<String> PQ=new PriorityQueue<String>();
        PQ.add("Alpha: a");
        PQ.add("Alpha: b");
        PQ.add("Bananan ");
        PQ.add("okay");
        System.out.println(PQ);
        System.out.println(PQ.remove());
        System.out.println(PQ.remove());
        System.out.println(PQ.remove());
        System.out.println(PQ.remove());
    }
}
