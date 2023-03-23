import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите номер билета : ");
        int ticket = input.nextInt();

        int digit1 = ticket / 100000;
        int digit2 = (ticket % 100000) / 10000;
        int digit3 = (ticket % 10000) / 1000;
        int digit4 = (ticket % 1000) / 100;
        int digit5 = (ticket % 100) / 10;
        int digit6 = ticket % 10;

        int sumOdd = digit1 + digit3 + digit5;
        int sumEven = digit2 + digit4 + digit6;

        if (sumOdd == sumEven) {
            System.out.println("Поздравляем! Ваш номер счастливый:) ");
        } else {
            System.out.println("К сожалению, ваш номер НЕ счастливый:( ");

            int nextTicket = ticket + 1;
            while (true) {

                int d1 = nextTicket / 100000;
                int d2 = (nextTicket % 100000) / 10000;
                int d3 = (nextTicket % 10000) / 1000;
                int d4 = (nextTicket % 1000) / 100;
                int d5 = (nextTicket % 100) / 10;
                int d6 = nextTicket % 10;

                int sOdd = d1 + d3 + d5;
                int sEven = d2 + d4 + d6;

                if (sOdd == sEven) {
                    System.out.println("Следующий номер счастливого билета: " + nextTicket);
                    break;
                } else {
                    nextTicket++;
                }
            }
        }
    }
}