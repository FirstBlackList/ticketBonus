import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, для рассчёта бонусных миль\nвведите стоимость Вашего билета:" );
        int ticketPrice = scanner.nextInt();
        int bonusMiles = 0;
        for(int i = 0; i < ticketPrice; i++){
            bonusMiles = bonusMiles + ticketPrice / 20;
            ticketPrice = ticketPrice % 20;
        }
        System.out.println("Вам начислено: " + bonusMiles + " миль(и)");

    }
}