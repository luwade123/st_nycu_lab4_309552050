import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Game game = new Game();
    public static void main(String[] args){
        System.out.print("=== Welcome to Rock-Paper-Scissors game === \n");
        System.out.print("Enter Player 1 choice (rock,paper or scissors): \n");

        game.getPlayer1(scanner.next());
        System.out.print("Enter Player 2 choice (rock,paper or scissors): \n");
        game.getPlayer2(scanner.next());
    }
}
