package game.tictactoe.repository;

import game.tictactoe.service.constructor.Constructor;

import java.util.ArrayList;

public class PlayerStorage {
    public static ArrayList<Constructor.PlayerConstructor> playersList = new ArrayList<>();

    //final means unchangeable, because Annette will be always there, with defined name and symbol
    public static final Constructor.AnnetteConstructor annette = new Constructor.AnnetteConstructor("Annette", 'O');
}
