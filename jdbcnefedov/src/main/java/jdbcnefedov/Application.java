package jdbcnefedov;

import jdbcnefedov.common.SingleConnectionPool;
import jdbcnefedov.common.StorageException;
import jdbcnefedov.player.Player;
import jdbcnefedov.player.PlayerRepository;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {
        Properties connectionProps = new Properties();
        try (InputStream props = Application.class.getResourceAsStream("/datasource.properties")) {
            connectionProps.load(props);
        } catch (IOException e) {
            panic(e);
        }
        String url = connectionProps.getProperty("url");
        try (Connection connection = DriverManager.getConnection(url, connectionProps)) {

            Supplier<Connection> connectionSupplier = new SingleConnectionPool(connection);

            //create and save players
            PlayerRepository playerRepository = new PlayerRepository(connectionSupplier);
            System.out.println("Input player names:");
            Scanner scanner = new Scanner(System.in);
            List<String> names = new LinkedList<>();
            String name;
            while (!(name = scanner.nextLine()).isEmpty()) {
                names.add(name);
            }
            for (String playerName : names) {
                playerRepository.save(new Player(playerName));
            }

            System.out.printf("%2s | %10s | %10s | %10s\n" +
                            "-----------------------------------------\n",
                    "id", "name", "rank", "score");

            for (Player player : playerRepository.list()) {
                printPlayer(player);
            }

            System.out.println("Input player id:");
            long id = scanner.nextLong();
            System.out.printf("%2s | %10s | %10s | %10s\n" +
                            "-----------------------------------------\n",
                    "id", "name", "rank", "score");

            printPlayer(playerRepository.get(id));
            System.out.print("\n\nAll Players:\n");

        } catch (SQLException | StorageException e) {
            panic(e);
        }
    }

    private static void printPlayer(Player player) {
        System.out.printf("%2d | %10s | %10s | %10d\n",
                player.getId(), player.getNickname(), player.getRank(), player.getScore());
    }

    public static void panic(Throwable e) {
        e.printStackTrace();
        System.exit(1);
    }

}
