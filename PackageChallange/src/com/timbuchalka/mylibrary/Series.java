package com.timbuchalka.mylibrary;

public class Series {
    public static long nSum(int n) {
        return (n * (n+1))/2;
    }

    public static long factorial(int n) {
        if(n == 0) {
            return 1;
        }
        long fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
