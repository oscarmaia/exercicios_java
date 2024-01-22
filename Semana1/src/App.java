public class App {
    public static void main(String[] args) throws Exception {
        Feriado[] feriados = new Feriado[] {
                new Feriado("01-01-2024", "Confraternização Mundial"),
                new Feriado("12-02-2024", "Carnaval"),
                new Feriado("13-02-2024", "Carnaval"),
                new Feriado("29-03-2024", "Sexta-feira Santa"),
                new Feriado("21-04-2024", "Tiradentes"),
                new Feriado("01-05-2024", "Dia do Trabalho"),
                new Feriado("30-05-2024", "Corpus Christi"),
                new Feriado("07-09-2024", "Independência do Brasil"),
                new Feriado("12-10-2024", "Nossa Senhora Aparecida"),
                new Feriado("02-11-2024", "Finados"),
                new Feriado("15-11-2024", "Proclamação da República"),
                new Feriado("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"),
                new Feriado("25-12-2024", "Natal")
        };
        Feriado feriado = new Feriado();
        System.out.println(feriado.isHoliday("01-01-2024", feriados));
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
