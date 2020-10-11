package Sword2offer;

public class Fibonacci10 {
    public static void main(String[] args) {
        Fibonacci10 text = new Fibonacci10();
        System.out.println(text.Fibonacci(3));
    }
    public int Fibonacci(int n) {
        int []result = {0,1};
        if(n < 2){
            return result[n];
        }
        int Fibonaccione = 0;
        int Fibonaccitwo = 1;
        int Fibonacciresult = 0;
        int i = 2;
        while(i <= n){
            Fibonacciresult = Fibonaccione + Fibonaccitwo;
            Fibonaccione = Fibonaccitwo;
            Fibonaccitwo = Fibonacciresult;
            i++;
        }
        return Fibonacciresult;
    }
}
