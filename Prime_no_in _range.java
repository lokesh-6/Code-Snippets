import java.util.*;

class Prime_no_in_range{
    public static List<Integer> generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();

        // Initialize the boolean array
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Collect all prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        System.err.println(generatePrimes(5));
    }

}