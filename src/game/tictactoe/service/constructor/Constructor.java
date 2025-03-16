package game.tictactoe.service.constructor;

public class Constructor {

    //player constructor
    public static class PlayerConstructor {
        public String playerName;
        public char playerSymbol;

        public PlayerConstructor(String playerName, char playerSymbol) {
            this.playerName = playerName;
            this.playerSymbol = playerSymbol;
        }
    }
}


