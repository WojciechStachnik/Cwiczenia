import java.util.Scanner;

public class Tasko8Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "Polska";
        String check;
        do{
            System.out.println("Podaj hasło");
            check = scanner.nextLine();
        }while (!password.equals(check));
        System.out.println("Podałeś poprawne hasło");
    }
}
