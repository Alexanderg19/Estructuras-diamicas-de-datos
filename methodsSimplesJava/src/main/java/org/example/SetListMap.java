package org.example;

import java.util.*;

public class SetListMap {
    public static void main(String[] args) {

        //ESTRUCTURA DE DATOS DINÁMICA SET
        /*
        - .add() para agregar elementos
        - .remove() para eliminar elementos
         */

        //HASHSET
        /*
        - No permite elementos duplicados
        - No garantiza orden de inserción segpun el valor
        - Es rápido
        - No permite acceso aleatorio
        */
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.remove(4); //Indicar valor a eliminar

        System.out.println(numbers);

        Set<String> letters = new HashSet<>();
        letters.add("a");
        letters.add("l");
        letters.add("e");
        letters.add("x");
        letters.remove("a");

        System.out.println(letters); //Indicar valor a eliminar

        //LINKEDHASHSET
        /*
        - No permite elementos duplicados
        - Ordenación por entrada
        - Eficiente para acceder
        */

        Set<String> letterslinkedHash = new LinkedHashSet<>();
        letterslinkedHash.add("a");
        letterslinkedHash.add("a");
        letterslinkedHash.add("l");
        letterslinkedHash.add("e");
        letterslinkedHash.add("x");
        letterslinkedHash.remove("a");

        System.out.println(letterslinkedHash);

        //TREESET
        /*
        - Es ordenado
        - Poco eficiente
        */
        Set<Integer> numbersTreeSet = new TreeSet<>();
        numbersTreeSet.add(1);
        numbersTreeSet.add(4);
        numbersTreeSet.add(3);
        numbersTreeSet.add(2);
        numbersTreeSet.remove(4); //Indicar valor a eliminar

        System.out.println(numbersTreeSet);


        //ESTRUCTURA DE DATOS DINÁMICA MAP
        /*
            - Asocia claves a valores
            -Me permite valos duplicados, m+as no claves duplicadas
            - .put() para agregar elementos
            - . remove() para eliminar elementos
        */

        //HASMAP
        /*
            -Almacena las claves en una tabla Hash
            - No se encuentra ordenada
        */

        Map<String, String> teamsColombia = new HashMap<>(4);//Opcional definica el initialCapacity, lo ideal es definicar tamaño ya que este marcará el rendimiento de la implementación
        teamsColombia.put("A", "Atletico Nacional");
        teamsColombia.put("C", "Millonarios");
        teamsColombia.put("B", "América");
        teamsColombia.put("E", "Deportivo Cali");

        //Como mostrar valores de un HashMap por consola
        for (String i : teamsColombia.keySet()) {
            System.out.println("lOS EQUIPOS MÁS GANADORES EN COLOMBIA SON: " + i + " - " + teamsColombia.get(i));
        }

        teamsColombia.remove(4);
        System.out.println(teamsColombia);

        //TREEMAP
        /*
            - Almacena las claves ordenándolas en función de sus valores
            - Es más lenta que HashMap
        */

        Map<Integer, String> cities = new TreeMap<>();
        cities.put(1, "Bogotá");
        cities.put(3, "Pereira");
        cities.put(2, "Medellín");
        cities.put(4, "Bucaramanga");

       for (Integer i: cities.keySet()) {
           System.out.println("Imprimiendo ciudades colombianas " + i + " " + cities.get(i));
       }

       //LINKEDHASHMAP
        /*
            - Almacena los elementos en función de su orden de inserción
        */

        Map<Integer, String> countries = new TreeMap<>();
        countries.put(1, "Colombia");
        countries.put(3, "Venezuela");
        countries.put(2, "Israel");
        countries.put(4, "Roma");

        for (Integer i: countries.keySet()) {
            System.out.println("Imprimiendo paises" + i + " " + countries.get(i));
        }

        //ESTRUCTURA DE DATOS DINÁMICA LIST
        /*
            - Puede almacenar elementos repetidos
            - Puede agregar elementos en un index especifico
            - Permite acceso aleatorio
            - Cada valor esta indexado numéricamente
            - Permite valores repetidos
            - .add() para agregar elementos
            - .get() para obtener un valor
            - .set() para modificar un valor
            - .remove() para eliminar elementos
        */


        //ARRAYLIST
        /*
            - Rápida accediendo a elementos
            - Se adapta a un gran número de escenarios
            - Se basa en un array redimensionable que aumenta su tamaño segun crece la coleción de elementos
        */

        List<Integer> years = new ArrayList<>();
        years.add(2000);
        years.add(2000);
        years.add(2010);
        years.add(2020);
        years.add(2030);
        years.add(2040);

        years.set(1, 2050);

        years.add(2, 2005);

        System.out.println(years.indexOf(2010)); //indexOf() me permite encontrar la primera concurrencia de un elementos en una lista
        System.out.println(years.contains(2005)); //Comprueba si un elementos esta presenta en una lista


        for (int i=0; i < years.size(); i++) {
            System.out.println(years.get(i));
        }

        years.stream()
                .filter(n -> n != 2000)
                .forEach(System.out::println);


        //EJERCICIO IMPLEMENTADO ARRAY, LISTA Y MAP PARA OBTENER LA CONCURRENCIA DE UN NÚMERO EN UN ARRAY

        int nums[] = {1, 1, 1, 5, 2, 2, 8, 6, 8, 9, 7, 3, 6, 2, 5, 8, 4};

        System.out.println(nums[3]);

        List<Integer> listNumbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            listNumbers.add(nums[i]);
        }

        Map<Integer, Integer> mapNumbers = new HashMap<>();

        for (int i = 0; i < listNumbers.size(); i++) {
            mapNumbers.putIfAbsent(listNumbers.get(i), Collections.frequency(listNumbers, listNumbers.get(i)));
        }

        System.out.println(mapNumbers);
    }
}
