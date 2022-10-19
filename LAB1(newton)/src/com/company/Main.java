package com.company;

public class Main {

    public static void main(String[] args) {
	final int N = 100;
        System.out.println(fibo(N));
        final double n=8, k=7;
        System.out.println(newton(n,k));
    }
    static int fibo(int n){
        if(n==1 || n==2)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
    }
    static double newton(double n ,double k){
        if(k==n || k==0)
            return 1;
        else
            return newton(n-1,k-1)+newton(n-1,k);
    }
}
