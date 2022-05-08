package factories;

import models.Bot;
import models.HumanPlayer;

public class PlayerFactory {
    public static HumanPlayer.HumanPlayerBuilder getHumanPlayer() {
        return HumanPlayer.builder();
    }

    public static Bot.BotBuilder getBotPlayer() {
        return Bot.builder();
    }
}
