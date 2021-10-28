import java.util.Random;
import java.util.Scanner;

public class RPS {
    private final  Player human;
    private final Player comp;
    private final GameReporter GameReport;


    public RPS(GameReporter gameReport, Player human, Player comp) {
        this.human = human;
        this.comp = comp;
        this.GameReport = gameReport;

    }

  public static void main(String[] args) {

        System.out.println("I want to play a game called ROCK PAPER SCISSORS");
        ComputerPlayer comp = new ComputerPlayer(new Random());
        HumanPlayer human = new HumanPlayer(new Scanner(System.in), System.out);
        GameReporter gameReport = new PrintStreamGameReporter(System.out);
        RPS game = new RPS(gameReport, human, comp);
        game.play();

    }

    public void play() {
        Move humanMove = human.getMove();
        Move compMove = comp.getMove();

        GameReport.reportMove(human, humanMove);
        GameReport.reportMove(comp, compMove);

        if (humanMove.beats(compMove)) {
            GameReport.reportWin(human);


        } else if (compMove.beats(humanMove)) {
            GameReport.reportWin(comp);

        } else {
            GameReport.reportDraw();
            play();
        }
    }

}


