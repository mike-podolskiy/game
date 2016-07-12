package kz.mix.game.logic;

import kz.mix.game.helper.AvailableCardsPool;
import kz.mix.game.model.Player;
import kz.mix.game.model.Table;

import static kz.mix.game.util.Constant.tableCardNumber;
import static kz.mix.game.util.Constant.handCardNumber;

public class Logic {
    private static Table game;

    // параметр массив имен
    public static void startGame(String[] playersNames) {
        game = new Table();

        if (playersNames.length < 2 || playersNames.length > 3) {
            throw new IllegalArgumentException("Количество игроков должно быть 2 или 3. Задано: " + playersNames.length);
        }

        for (String name : playersNames) {
            game.getPlayers().add(new Player(name));
        }

        for (int i = 0; i < handCardNumber; i++) {
            for (Player player : game.getPlayers()) {
                player.getHand().getStartingHand().add(AvailableCardsPool.getAndRemoveCardFromPool());
            }
        }

        for (int i = 0; i < tableCardNumber; i++) {
            game.getTable().add(AvailableCardsPool.getAndRemoveCardFromPool());
        }
    }

    public static Table getGame() {
        return game;
    }
}
