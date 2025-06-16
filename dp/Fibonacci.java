package dp;
public class Fibonacci{
    static int[] dp; // Declare array for memoization

    public static int fib(int n) {
        // Base case
        if (n <= 1) return n;

        // If already computed, return value
        if (dp[n] != -1) return dp[n];

        // Recursively compute and store result
        dp[n] = fib(n - 1) + fib(n - 2);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;

        // Initialize dp array with -1
       int [] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
    }
}