package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String text = "Hola a todos, bienvenidos a mi curso básico de Java";
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter( n-> n%2==0)
                .forEach(System.out::println);


        char miarray[] = {'A','V','I','L','A'};
        System.out.println(String.valueOf(miarray));

        String numString = "40";
        int num = Integer.parseInt(numString);

        String numString2 = "20";
        int num2 = Integer.parseInt(numString2);

        System.out.println(numString + numString2);
        System.out.println(num + num2);


    }
}