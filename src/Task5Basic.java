import java.util.Scanner;

public class Task5Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = scanner.nextInt();
        if (a%3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        }else{
            System.out.println("Liczba jest niepodzielna przez 3");
        }

    }
}
