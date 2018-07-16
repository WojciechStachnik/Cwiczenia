import java.util.Scanner;

public class Task2Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        double c;
        System.out.println("Podaj pierwszą liczbę");
        a = scanner.nextInt();
        System.out.println("Podaj drugia liczbę");
        b = scanner.nextInt();
        c = (a+b)/2d;
        System.out.println(c);
    }
}
