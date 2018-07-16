import java.util.Scanner;

public class Task4Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Podaj pierwszą liczbę");
        a = scanner.nextInt();
        System.out.println("Podaj drugą liczbe");
        b = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę");
        c = scanner.nextInt();
        if (a<b && a<c){
            System.out.println(a);
        }else if (b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
