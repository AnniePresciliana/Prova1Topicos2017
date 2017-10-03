public class Fibonacci {
 import java.util.Scanner;import java.util.Scanner;
   import java.util.Scanner;
   
    static long fibo(int num) {
        if (num < 2) {
            return num;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }
    }
 
    public static void main(String[] args) {   
	
	// teste do programa. Imprime os 30 primeiros termos       
	for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }
 
    }
 
}