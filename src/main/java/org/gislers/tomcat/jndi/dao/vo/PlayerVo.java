package org.gislers.tomcat.jndi.dao.vo;

import javax.persistence.*;

@NamedQueries({
    @NamedQuery(
        name  = "findPlayerByPlayerName",
        query = "from Player p where p.playerName = :playerName"
    ),
    @NamedQuery(
        name  = "findPlayerByPlayerNumber",
        query = "from Player p where p.playerNumber = :playerNumber"
    )
})

@Entity
@Table(name="Player", uniqueConstraints={@UniqueConstraint(columnNames={"PLAYER_ID"})})
public class PlayerVo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="PLAYER_ID", nullable=false, unique=true, length=11)
    private int playerId;

    @Column(name="PLAYER_NAME", nullable=false)
    private String playerName;

    @Column(name="PLAYER_NUMBER", nullable=false)
    private int playerNumber;

    @Column(name="PLAYER2_TEAM_ID", nullable=true)
    private int teamId;

    public PlayerVo() {
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
