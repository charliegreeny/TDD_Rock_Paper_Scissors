import java.util.Random;

public class ComputerPlayer implements Player{
    private final Random random;


    public ComputerPlayer(Random random){
        this.random = random;

    }

    @Override
    public Move getMove() {
        return Move.values()[random.nextInt(3)];
    }

    @Override
    public String getName() {
        return "COMPUTER";
    }
}
