import java.util.Random;

public class Task7Loop {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 6; i++){
            System.out.println(random.nextInt(49)+1);
        }

    }
}
