package org.gislers.tomcat.jndi.dao.vo;

public class TeamVo {

    private int teamId;
    private String teamName;

    public TeamVo() {
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public enum COLUMNS {
        TEAM_ID,
        TEAM_NAME
    }
}
