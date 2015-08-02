package org.gislers.tomcat.jndi.dao;

import org.gislers.tomcat.jndi.dao.vo.TeamVo;

import java.util.List;

public interface TeamDao {

    void save( TeamVo teamVo );
    void deleteByTeamId( int teamId );
    List<TeamVo> getAll();
    TeamVo findByTeamId( int teamId );
    TeamVo findByPlayerId( int playerId );
    TeamVo findByTeamName( String teamName );
}
