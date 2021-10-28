import java.io.PrintStream;

public class PrintStreamGameReporter implements GameReporter {
    private final PrintStream out;

    public PrintStreamGameReporter(PrintStream out) {
        this.out = out;
    }

    @Override
    public void reportDraw() { out.println("IT IS A DRAW");
    }

    @Override
    public void reportMove(Player player, Move move){
        out.println(player.getName() + " chose " + move);
    }

    @Override
    public void reportWin(Player winner) {
        out.println(winner.getName() + " WINS");
    }
}