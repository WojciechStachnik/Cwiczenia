import java.util.Scanner;

public class Task4String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        if (Character.isDigit(word.charAt(0))){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
    }
}
