public class App {
    public static void main(String[] args) throws Exception {
        String[] arr1 = new String[] { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        String[] arr2 = new String[] { "Manga", "Caqui", "Morango", "Amora" };
        compareArray(arr1, arr2);
    }

    static void compareArray(String[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    static void piramide(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void multiply(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    };

    static void printFibonacci(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
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
