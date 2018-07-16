import java.util.Scanner;

public class Task3String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String word = scan.nextLine();
        if (word.endsWith("m") || word.endsWith("M")){
            System.out.println("Słowo kończy się na M lub m");
        }else{
            System.out.println("Słow się kończy inaczej");
        }
    }
}
