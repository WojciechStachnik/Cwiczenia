import java.util.Scanner;

public class Task6String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = scan.nextLine();
        System.out.println("Podaj nazwisko");
        String lastname = scan.nextLine();
        System.out.println("Imię i nazwisko "+name+" "+lastname );

    }
}
