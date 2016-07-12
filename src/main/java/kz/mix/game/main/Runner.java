package kz.mix.game.main;

import kz.mix.game.helper.AvailableCardsPool;
import kz.mix.game.logic.Logic;
import kz.mix.game.model.Player;

public class Runner {
    public static void main(String[] args) {
        AvailableCardsPool.generateNewPool();

        Logic.startGame(new String[] {"Player1", "Player2"});

        for (Player player : Logic.getGame().getPlayers()) {
            System.out.println(player);
        }

        System.out.println(Logic.getGame().getTable());


    }
}
