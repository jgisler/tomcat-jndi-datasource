package org.gislers.tomcat.jndi.dao;

import org.gislers.tomcat.jndi.dao.vo.TeamVo;

import java.util.List;

public interface TeamDao {

    int createTeam( TeamVo teamVo );
    void updateTeam( TeamVo teamVo );
    void deleteTeam( int teamId );

    List<TeamVo> getAllTeams();
    TeamVo getTeamByTeamId( int teamId );
    TeamVo getTeamByPlayerId( int playerId );
    TeamVo getTeamByTeamName( String teamName );
}
