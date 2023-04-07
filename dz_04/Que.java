package dz_04;

import java.util.LinkedList;

public class Que {
    LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int item){
        list.addLast(item);
    }
    public int dequeue(){
        return list.pollFirst();
    }
    public int first(){
        return list.peekFirst();
    }

}