import java.util.Scanner;

public class Task1Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] table = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Podaj liczbe");
            table[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println();
        for (int i = n - 1; i >= 0; i--){
            System.out.print(table[i] + " ");
        }
    }
}
