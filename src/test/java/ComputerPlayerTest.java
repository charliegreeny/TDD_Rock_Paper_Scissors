
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ComputerPlayerTest {
    private Random stubRandom = mock(Random.class);
    private ComputerPlayer comp = new ComputerPlayer(stubRandom);

    @Test
    void twoIsScissors() {
        //Arrange
        when(stubRandom.nextInt(3)).thenReturn(2);

        //Act
        Move move = comp.getMove();
        //Assert
        assertEquals(Move.SCISSORS, move);

    }
}
