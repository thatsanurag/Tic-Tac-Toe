import tictactoe.Controller.GameController;
import tictactoe.models.Game;

public class main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Game game = GameController.startGame();
    }
}
