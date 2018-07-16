import java.util.Scanner;

public class Task8String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String word = scan.nextLine();
        System.out.println("Podaj słowo");
        String word1 = scan.nextLine();
        if (word.equals(word1)){
            System.out.println("tak");
        }else{
            System.out.println("nie");
        }

    }
}
