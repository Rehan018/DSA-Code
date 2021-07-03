package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {
        List<Integer> arrayListl=new ArrayList<>();
        List<Integer> ll=new LinkedList<>();
        getDiff(arrayListl);
        getDiff(ll);

    }
    static void getDiff(List<Integer> list){
        long start=System.currentTimeMillis();
        for(int i =0; i<1000000; i++){
            list.add(0,i);
        }
        long end=System.currentTimeMillis();
        System.out.println(list.getClass().getName()+":===> "+(end-start));
    }
}
