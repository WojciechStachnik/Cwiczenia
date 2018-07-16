import java.util.Scanner;

public class Task6Loop {
    public static void main(String[] args) {
        int n = 600;
        int a=0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Podaj liczbe");
            a = scanner.nextInt();
            if (a > n){
                System.out.println("Za dużo");
            }else if ( a<n){
                System.out.println("Za mało");
            }
        }while (a != n);
        System.out.println("Zgadłeś");
    }
}
