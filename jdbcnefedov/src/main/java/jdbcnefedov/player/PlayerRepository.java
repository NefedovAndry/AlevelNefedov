package jdbcnefedov.player;

import jdbcnefedov.common.Repository;
import jdbcnefedov.common.StorageException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class PlayerRepository implements Repository<Player, Long> {

    private final Supplier<Connection> connectionSupplier;

    public PlayerRepository(Supplier<Connection> connectionSupplier) {
        this.connectionSupplier = connectionSupplier;
    }

    @Override
    public void save(Player entity) throws StorageException {
        String nickname = entity.getNickname();
        long score = entity.getScore();
        String sql = "INSERT INTO players_db (nikname, score) VALUES (?, ?) " +
                "ON DUPLICATE KEY UPDATE nikname = ?, score = ?";
        try (PreparedStatement statement = connectionSupplier.get().prepareStatement(sql)) {
            statement.setString(1, nickname);
            statement.setLong(2, score);
            statement.setString(3, nickname);
            statement.setLong(4, score);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new StorageException(e);
        }

    }

    @Override
    public List<Player> list() throws StorageException {
        String sql = "SELECT players_db.id id, players_db.nikname name, ranks.name player_rank, players_db.score score " +
                "FROM players_db INNER JOIN ranks " +
                "ON players_db.score BETWEEN lower_t AND upper_t - 1";
        try (PreparedStatement statement = connectionSupplier.get().prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();
            List<Player> players = new LinkedList<>();
            while (resultSet.next()) {
                players.add(buildPlayerFromResultSet(resultSet));
            }
            return players;
        } catch (SQLException e) {
            throw new StorageException(e);
        }
    }

    @Override
    public Player get(Long id) throws StorageException {
        String sql = "SELECT players_db.id id, players_db.nikname name, ranks.name player_rank, players_db.score score " +
                "FROM players_db INNER JOIN ranks " +
                "ON players_db.score BETWEEN lower_t AND upper_t - 1 " +
                "WHERE players_db.id = ?";
        try (PreparedStatement statement = connectionSupplier.get().prepareStatement(sql)) {
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            Player player;
            if (resultSet.first()) {
                player = buildPlayerFromResultSet(resultSet);
            } else {
                player = null;
            }
            return player;
        } catch (SQLException e) {
            throw new StorageException(e);
        }
    }

    @Override
    public void delete(Player entity) throws StorageException {
        String sql = "DELETE FROM players_db WHERE id = ?";
        try (PreparedStatement statement = connectionSupplier.get().prepareStatement(sql)) {
            statement.setLong(1, entity.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new StorageException(e);
        }
    }

    private static Player buildPlayerFromResultSet(ResultSet resultSet) throws SQLException {
        return new Player(
                resultSet.getLong("id"),
                resultSet.getString("name"),
                resultSet.getString("player_rank"),
                resultSet.getLong("score")
        );
    }

}
