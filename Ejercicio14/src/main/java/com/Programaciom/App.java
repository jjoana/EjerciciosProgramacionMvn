package com.Programaciom;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;


public class App {
    public static void main(String[] args) {
        int[] listaEnteros = {2,4,7,3,9,7,4};
        IntStream.of(listaEnteros)
            .forEach(System.out::println);

        IntStream.range(1,50)
            .limit(20)
            .forEach(System.out::println);

        IntStream.iterate( 2, (n)-> n+2)
            .limit(10)
            .forEach(System.out::println);
        
        Random rnd = new Random();

        DoubleStream doublesd = DoubleStream.empty();
        DoubleStream.concat(doublesd, rnd.doubles())
        .limit(10)
        .forEach(System.out::println);
    }
}
