package org.gislers.tomcat.jndi.dao;

import org.gislers.tomcat.jndi.dao.vo.PlayerVo;

import java.util.List;

public interface PlayerDao {

    void save( PlayerVo playerVo );
    void deleteByPlayerId( int playerId );
    PlayerVo findByPlayerId( int playerId );
    List<PlayerVo> findByTeamId( int teamId );
    PlayerVo findByPlayerName( String playerName );
}
