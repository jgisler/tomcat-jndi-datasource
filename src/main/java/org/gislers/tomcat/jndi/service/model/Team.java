package org.gislers.tomcat.jndi.service.model;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private int teamId;
    private String teamName;
    private List<Player> roster = new ArrayList<Player>();

    public Team() {
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

    public List<Player> getRoster() {
        return roster;
    }

    public void setRoster(List<Player> roster) {
        this.roster = roster;
    }
}
