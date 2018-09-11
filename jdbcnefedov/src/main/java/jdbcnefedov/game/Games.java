package jdbcnefedov.game;

import java.util.List;
import java.util.Objects;

public class Games {

    private final Long id;
    private final Long idWinner;
    private final Long score;
    private final List<Long> playersList;


    public Games(Long id, Long idWinner, Long score, List<Long> playersList) {
        this.id = id;
        this.idWinner = idWinner;
        this.score = score;
        this.playersList = playersList;
    }

    public Long getId() {
        return id;
    }

    public Long getIdWinner() {
        return idWinner;
    }

    public Long getScore() {
        return score;
    }

    public List<Long> getPlayersList() {
        return playersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Games games = (Games) o;
        return Objects.equals(id, games.id) &&
                Objects.equals(idWinner, games.idWinner) &&
                Objects.equals(score, games.score) &&
                Objects.equals(playersList, games.playersList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idWinner, score, playersList);
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", idWinner=" + idWinner +
                ", score=" + score +
                ", playersList=" + playersList +
                '}';
    }
}
