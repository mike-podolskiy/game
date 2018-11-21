package kz.mix.game.service;

import kz.mix.game.model.Card;
import kz.mix.game.model.Player;
import kz.mix.game.model.Table;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static kz.mix.game.util.Constant.NUMBER_OF_CARDS_ON_TABLE;
import static kz.mix.game.util.Constant.NUMBER_OF_CARDS_IN_HAND;

public class Game {
    private Table table;
    private PackService packService;

    public Game(Table table, PackService packService) {
        this.table = table;
        this.packService = packService;
    }

    // параметр имена игроков
    public void start(String... playersNames) {
        if (playersNames.length < 2 || playersNames.length > 3) {
            throw new IllegalArgumentException("Количество игроков должно быть 2 или 3. Задано: " + playersNames.length);
        }

        Arrays.stream(playersNames).forEach(name -> table.addPlayer(new Player(name)));

        for (int i = 0; i < NUMBER_OF_CARDS_IN_HAND; i++) {
            table.getPlayers().forEach(player -> player.addHandCard(packService.retrieveCardFromPack()));
        }

        for (int i = 0; i < NUMBER_OF_CARDS_ON_TABLE; i++) {
            table.addCard(packService.retrieveCardFromPack());
        }
    }

    public List<Player> getPlayers() {
        return table.getPlayers();
    }

    public List<Card> getCards() {
        return table.getCards();
    }
}
