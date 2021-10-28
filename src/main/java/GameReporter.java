public interface GameReporter {

    void reportDraw();

    void reportMove(Player player, Move move);

    void reportWin(Player winner);
}
