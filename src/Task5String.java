import java.util.Scanner;

public class Task5String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słow");
        String word = scanner.nextLine();
        if (word.charAt(0) == word.charAt(word.length()-1)){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
    }
}
