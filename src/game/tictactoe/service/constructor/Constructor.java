package game.tictactoe.service.constructor;

public class Constructor {
    public static class PlayerConstructor {
        public String playerName;
        public char playerSymbol;

        //Player constructor
        public PlayerConstructor(String playerName, char playerSymbol) {
            this.playerName = playerName;
            this.playerSymbol = playerSymbol;
        }
    }

    public static class AnnetteConstructor {
        public String AIName;
        public char AISymbol;

        //Annette constructor
        public AnnetteConstructor(String Annette, char AISymbol) {
            this.AIName = Annette;
            this.AISymbol = AISymbol;
        }
    }
}


