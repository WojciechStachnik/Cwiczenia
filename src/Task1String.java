import java.util.Scanner;

public class Task1String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz słowo");
        String word = scan.nextLine();
        System.out.println("Słowo składa się z " + word.length() +" liter");
    }
}
