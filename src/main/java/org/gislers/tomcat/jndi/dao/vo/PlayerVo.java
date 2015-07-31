package org.gislers.tomcat.jndi.dao.vo;

public class PlayerVo {

    private int playerId;
    private int teamId;
    private String playerName;
    private int playerNumber;

    public PlayerVo() {
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
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

    public enum COLUMNS {
        PLAYER_ID,
        PLAYER2TEAM_ID,
        PLAYER_NAME,
        PLAYER_NUMBER;
    }
}
