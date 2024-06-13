package org.leona;

import dataStructure.Queue;

import java.util.Random;

public class FilaDeAtendimento {
    public static void main(String[] args) {
        int n = 5;
        var random = new Random();
        int cliente = random.nextInt(101);
        Queue queue = new Queue(cliente);
        System.out.println("Cliente: " + cliente);
        for (int i = 2; i <= n; i++) {
            cliente = random.nextInt(101);
            System.out.println("Cliente: " + cliente);
            queue.enqueue(cliente);
        }
        var node = queue.dequeue();
        while (node != null) {
            System.out.println("Atendimento" + node.getValue());
            node = queue.dequeue();
        }
    }
}
