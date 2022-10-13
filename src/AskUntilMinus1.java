import java.util.Scanner;

public class AskUntilMinus1 {
    public static void main(String[] args) {
        int heltal;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Skriv et hel tal: ");
            heltal = in.nextInt();
        } while (heltal !=-1);
        System.out.println(heltal);

    }
}
