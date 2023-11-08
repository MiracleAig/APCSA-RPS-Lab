import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("---Paper Rock Scissors---");
        System.out.println("");
        System.out.println("---Menu---");
        System.out.println("1. Paper");
        System.out.println("2. Rock");
        System.out.println("3. Scissors");
        System.out.println();
        System.out.print("Enter your selection: ");
        int choice = kb.nextInt();
        System.out.println();
        System.out.println(RPS.choiceText(choice));
        System.out.println(RPS.gameResults(choice, 3));
    }
}
