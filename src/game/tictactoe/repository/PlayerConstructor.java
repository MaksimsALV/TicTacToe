package game.tictactoe.repository;

public class PlayerConstructor {
    public String playerName;
    public char playerSymbol;

    //constructor
    public PlayerConstructor(String playerName, char playerSymbol) {
        this.playerName = playerName;
        this.playerSymbol = playerSymbol;
    }

    //todo do i need this ?
    public String getPlayerName() {
        return playerName;
    }

    public char getPlayerSymbol() {
        return playerSymbol;
    }
}
