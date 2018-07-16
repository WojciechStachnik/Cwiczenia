import java.util.Scanner;

public class Task2String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String word = scan.nextLine();
        System.out.println("Podaj liczbę");
        int n = scan.nextInt();
        System.out.println(word.substring(n));
    }
}
