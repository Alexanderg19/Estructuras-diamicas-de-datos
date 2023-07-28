package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
    public static void main(String[] args) {

        // Stack and Queue
        /*
            - Estructuras de datos lineales
            - Stack funciona bajo el principio LIFO (Last in Frist out)
            - Queue funciona bajo el principio FIFO (Firs in First out)
            - Stack se utiliza para resolver problemas d erecursión, lo que significa, que una función se invoca a si misma
              durante su ejecución para resolver tareas más simples.
            - Queue se utiliza para resolver problemas  que tienen un procesamiento secuencial.
        */

        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        System.out.println(numbers);
        numbers.pop();
        System.out.println(numbers);
        System.out.println(numbers.peek());

        Queue<String> words = new LinkedList<>();

        words.add("A");
        words.add("Alex");
        words.add("Abby");
        words.add("Ingrid");

        System.out.println(words);
        words.remove();
        System.out.println(words);
        System.out.println(words.peek());


        //Invertir una cadena

        Stack<String> character = new Stack<>();

        character.add("X");
        character.add("E");
        character.add("L");
        character.add("A");

        System.out.println(character);

        while (!character.isEmpty()) {
            String name = character.pop();
            System.out.printf(name);
        }


    }
}
