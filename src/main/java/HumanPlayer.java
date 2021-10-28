import java.io.PrintStream;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private Scanner scanner;
    private final PrintStream spyPrintStream;

    public HumanPlayer(Scanner scanner, PrintStream spyPrintStream) {
        this.scanner = scanner;
        this.spyPrintStream = spyPrintStream;
    }

    @Override
    public Move getMove() {
        spyPrintStream.println("Please enter 1 (Rock), 2 (Paper) or 3(Scissors)");
        return Move.values()[scanner.nextInt()- 1 ];
    }

    @Override
    public String getName() {
        return "HUMAN";
    }
}

