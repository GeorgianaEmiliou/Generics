package com.sparta.ge;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=10; i++){
            queue.add(i);
        }

        System.out.println("Elements of queue: " + queue);

        int remove = queue.remove();
        System.out.println("Remove element: " + remove);
        System.out.println("Elements of queue: " + queue);

        int addElement = 11;
        queue.add(addElement);
        System.out.println("Add the number " + addElement + " in the queue");
        System.out.println("Elements of queue: " + queue);

        int head = queue.peek();
        System.out.println("Head of queue: " + head);


        int size = queue.size();
        System.out.println("Size of queue: " + size);
    }
}
