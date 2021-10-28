import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class HumanPlayerTest {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream spyPrintStream = new PrintStream(outputStream);


    @Test
    void twoIsPaper() {
        //Arrange;
        Player player = new HumanPlayer(makeFakeScanner("2"), spyPrintStream);
        //Act
        Move move = player.getMove();
        //Assert
        assertEquals(Move.PAPER, move);
    }


    private Scanner makeFakeScanner(String input) {
        return new Scanner(input);
    }

    @Test
    void printMessage() {
        //Arrange
        Player player = new HumanPlayer(makeFakeScanner("1"), spyPrintStream);
        //Act
        player.getMove();
        //Assert
        Assertions.assertEquals("Please enter 1 (Rock), 2 (Paper) or 3(Scissors)" + System.lineSeparator(), outputStream.toString());

    }



}
