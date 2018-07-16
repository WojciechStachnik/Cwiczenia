import java.util.Scanner;

public class Task3Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Podaj pierwszą liczbę");
        a = scanner.nextInt();
        System.out.println("Podaj drugia liczbę");
        b = scanner.nextInt();
        System.out.println("Osób w jednym rzędzie:" + a/b);
        if (a%b!=0){
            System.out.println("W ostatnim rzędzie będzie " + a%b + " miejsc");
        }
    }
}
