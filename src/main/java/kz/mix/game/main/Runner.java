package kz.mix.game.main;

import kz.mix.game.helper.AvailableCardsPool;
import kz.mix.game.logic.Game;
import kz.mix.game.model.Player;

public class Runner {
    public static void main(String[] args) {
        AvailableCardsPool.generateNewPool();

        Game.start("Player1", "Player2");

        for (Player player : Game.get().getPlayers()) {
            System.out.println(player);
        }

        System.out.println(Game.get().getTable());


    }
}
