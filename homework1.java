import java.util.Scanner;

public class homework1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 задача");
            System.out.println("2 задача");
            System.out.println("3 задача");
            System.out.println("0 завершение работы");
            System.out.print("Введите номер задачи: ");
            int no = Integer.parseInt(scanner.nextLine());

            if (no == 1) {
                product();
                System.out.println();
            } else if (no == 2) {
                simplenumbers();
                System.out.println();
                System.out.println();
            } else if (no == 3) {
                calculator();
                System.out.println();
                System.out.println();
            } else if (no == 0) {
                f = false;
                System.out.print("Завершение работы");
            }
        }
    }

    public static int product() {
        System.out.println("Вычислить произведение чисел от 1 до N");
        System.out.print("Введите число: ");
        int number = Integer.parseInt(scanner.nextLine());
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
        return result;
    }

    public static void simplenumbers() {
        for (int i = 2; i <= 1000; i++){
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static void calculator() {
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите операцию (+ - * /): ");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            int result = a + b;
            System.out.printf("Ответ: %d", result);
        }
        else if (operation == '-') {
            int result = a - b;
            System.out.printf("Ответ: %d", result);
        }
        else if (operation == '*') {
            int result = a * b;
            System.out.printf("Ответ: %d", result);
        }
        else if (operation == '/') {
            int result = a / b;
            System.out.printf("Ответ: %d", result);
        }
    }
}
