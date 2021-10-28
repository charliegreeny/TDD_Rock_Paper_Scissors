import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class RPSTests {

    private GameReporter gameReporter = mock(GameReporter.class);
    private final Player human = mock(Player.class);
    private final Player comp = mock(Player.class);
    RPS game = new RPS(gameReporter, human, comp);

    @Test
    void humanCanWin() {

        //Arrange
        when(human.getMove()).thenReturn(Move.ROCK);
        when(comp.getMove()).thenReturn(Move.SCISSORS);
        //Act
        game.play();
        //Assert
        verify(gameReporter).reportWin(human);
    }

    @Test
    void compCanWin() {
        //Arrange
        when(human.getMove()).thenReturn(Move.PAPER);
        when(comp.getMove()).thenReturn(Move.SCISSORS);
        // Act
        game.play();
        //Assert
        verify(gameReporter).reportWin(comp);
    }
    @Test
    void canDraw(){
        //Arrange
        when(human.getMove()).thenReturn(Move.PAPER).thenReturn(Move.SCISSORS);
        when(comp.getMove()).thenReturn(Move.PAPER);
        // Act
        game.play();
        //Assert
        verify(gameReporter).reportDraw();
        verify(gameReporter).reportWin(human);
    }

    @Test
    void showMoves(){
        when(human.getMove()).thenReturn(Move.ROCK);
        when(comp.getMove()).thenReturn(Move.SCISSORS);
        // Act
        game.play();
        //Assert
        verify(gameReporter).reportMove(human, Move.ROCK);
        verify(gameReporter).reportMove(comp, Move.SCISSORS);
    }

    }