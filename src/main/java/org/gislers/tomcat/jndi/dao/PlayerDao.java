package org.gislers.tomcat.jndi.dao;

import org.gislers.tomcat.jndi.dao.vo.PlayerVo;

import java.util.List;

public interface PlayerDao {

    // CRUD
    int createPlayer( PlayerVo playerVo );
    void updatePlayer( PlayerVo playerVo );
    void deletePlayer( int playerId );

    PlayerVo findPlayerByPlayerId( int playerId );
    List<PlayerVo> findPlayersByTeamId( int teamId );
    PlayerVo findPlayerByPlayerName( String playerName );
}
