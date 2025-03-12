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

    //Annette constructor
    public static class AnnetteConstructor extends PlayerConstructor{

        public AnnetteConstructor(char playerSymbol) {
            super("Annette", playerSymbol);
        }
    }
}


