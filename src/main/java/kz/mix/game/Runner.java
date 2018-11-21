package kz.mix.game;

import kz.mix.game.model.Table;
import kz.mix.game.service.Game;
import kz.mix.game.service.PackService;

public class Runner {
    public static void main(String[] args) {

        // TODO: 21.11.2018 should be splitted into steps: pre-flop -> flop -> turn -> river
        // TODO: 21.11.2018 bets should be added
        // TODO: 21.11.2018 calculate possibility of win in percents for each player
        Game game = new Game(new Table(), new PackService());
        game.start("Player1", "Player2");

        game.getPlayers().forEach(System.out::println);
        System.out.println(game.getCards());
    }
}
