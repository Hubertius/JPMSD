package pl.hubertius.example;

import pl.hubertius.mylibrary.toImport.Series;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Factorial.");
        for(int i = 1; i <= 10 ; i++) {
            System.out.println("i: " + i + ", value for number: " + Series.factorial(i));
        }
        System.out.println("****");
        System.out.println("Fibonacci.");
        for(int i = 1; i <= 10 ; i++) {
            System.out.println("i: " + i + ", value for number: " + Series.fibonacci(i));
        }
    }
}
