import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите целое число от 1 до 12 для вычисления факториала: ");
        int value = new Scanner(System.in).nextInt();
        int factorial = 1;

        System.out.print(value + "! = 1");
        for (int i = 2; i <= value; i = i + 1) {
            System.out.print(" x " + i);
            factorial = factorial * i;
        }
        System.out.print(" = " + factorial);
        System.out.println("Расчет завершен.");
    }
}
