package org.example.algorithms.recursion;

public class Fabonacci {
    public static void printFib(int a,int b,int n) {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c); 
        // a=b;
        // b=c;
        printFib(b, c, n-1);
    }
    public static void main(String args[]) {
        int a=0,b=1;
        System.out.println(a);
        System.err.println(b);
        int n=7;
        printFib(a, b, n-2);
    }
}
