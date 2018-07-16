import java.util.Scanner;

public class Task5Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scanner.nextInt();
        int a = 0;
        for (int i = 1; i <=n; i++){
            a = i +a;
        }
        System.out.println(a);
    }
}
