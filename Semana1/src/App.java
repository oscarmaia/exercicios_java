public class App {
    public static void main(String[] args) throws Exception {
        WhatIsThisNumber(6);
    }

    static void WhatIsThisNumber(int n) {
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
    }
}
