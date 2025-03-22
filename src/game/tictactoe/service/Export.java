package game.tictactoe.service;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Export {

    public static void writeToCSV(String playerName) {
        Path outputPath = Path.of(System.getProperty("user.home"), "IdeaProjects", "TicTacToe", "src", "game", "tictactoe", "storage", "statistics.csv");

        //writing winner data to the file without clearing previous records
        try (BufferedWriter writer = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            writer.write(playerName + ",1"); //it always will be 1 (for now)
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
