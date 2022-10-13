import java.util.Scanner;

public class GangeMangeGangeIndtil {
    public static void main(String[] args) {
        double tal;
        double number = 2.3;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Skriv et kommatal: ");
            tal = in.nextDouble();
            System.out.println(tal * number);
        } while (tal != 0);
    }
}
