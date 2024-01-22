public class App {
    public static void main(String[] args) throws Exception {
        printFibonacci(7);
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    };

    static void printFibonacci(int n) {
        int count = n;
        while (count >= 0) {
            System.out.print(fibonacci(count) + " ");
            count--;
        }
    }

    static void whatIsThisNumber(int n) {
        if (n % 2 == 0) {
            if (n > 0) {
                System.out.println(n + " é par e positivo");
            } else {
                System.out.println(n + " é par e negativo");
            }
        } else {
            if (n > 0) {
                System.out.println(n + " é ímpar e positivo");
            } else {
                System.out.println(n + " é ímpar e negativo");
            }

        }
    };
}
