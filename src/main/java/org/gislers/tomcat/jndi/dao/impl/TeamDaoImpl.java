package org.gislers.tomcat.jndi.dao.impl;

import org.gislers.tomcat.jndi.dao.TeamDao;
import org.gislers.tomcat.jndi.dao.vo.TeamVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeamDaoImpl implements TeamDao {

    public int createTeam(TeamVo teamVo) {
        return 0;
    }

    public void updateTeam(TeamVo teamVo) {

    }

    public void deleteTeam(int teamId) {

    }

    public List<TeamVo> getAllTeams() {
        return null;
    }

    public TeamVo getTeamByTeamId(int teamId) {
        return null;
    }

    public TeamVo getTeamByPlayerId(int playerId) {
        return null;
    }

    public TeamVo getTeamByTeamName(String teamName) {
        return null;
    }
}
