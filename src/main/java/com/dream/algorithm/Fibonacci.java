package suanfa;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.Fibonacci(4));
    }

    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    int FibonacciPerfect(int n) {
        if (n == 0 || n == 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i=2; i<=n; ++i) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }


}
