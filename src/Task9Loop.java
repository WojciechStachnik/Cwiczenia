import java.util.Scanner;

public class Task9Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long a = 1;
        for (int i =1; i <= n; i++){
            a = a * i;
        }
        System.out.println(a);
    }
}
