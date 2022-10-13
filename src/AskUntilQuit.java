import java.util.Scanner;

public class AskUntilQuit {
    public static void main(String[] args) {
        String text;
        boolean keepGoing = true;
        Scanner in = new Scanner(System.in);

        while(keepGoing) {
            System.out.println("Type a textstreng: ");
            text = in.nextLine();

            if (text.equals("quit")) {
                ;
                System.out.println(text);
                keepGoing = false;

            } else {

            }

        }
    }
}
