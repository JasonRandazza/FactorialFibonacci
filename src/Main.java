public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int n = 5;
        int result = main.factorial(n);
        int result2 = main.fibonacci(n);
        System.out.println("Factorial of " + n + " is: " + result);
        System.out.println("Fibonacci of " + n + " is: " + result2);
    }
    public int factorial (int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public int fibonacci (int n) {
        if (n == 1 || n == 2) { //or if (n <=2)
            return 1;           // return 1
        }
        else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
