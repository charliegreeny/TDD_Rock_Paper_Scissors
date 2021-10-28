import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


class PrintStreamGameReporterTest {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream PrintStream = new PrintStream(outputStream);
    PrintStreamGameReporter gameReporter = new PrintStreamGameReporter(PrintStream);
    Scanner scanner = new Scanner(System.in);


    @Test
    void Draw() {
        gameReporter.reportDraw();
        Assertions.assertEquals("IT IS A DRAW" + System.lineSeparator(), outputStream.toString());
    }

    @Test
    void HumanWinner(){
        Player human= new HumanPlayer(scanner, PrintStream);
        gameReporter.reportWin(human);
        Assertions.assertEquals("HUMAN WINS" + System.lineSeparator(), outputStream.toString());
    }

}