package org.gislers.tomcat.jndi.dao.impl;

import org.gislers.tomcat.jndi.dao.PlayerDao;
import org.gislers.tomcat.jndi.dao.vo.PlayerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class PlayerDaoImpl implements PlayerDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDatasource( DataSource datasource ) {
        jdbcTemplate = new NamedParameterJdbcTemplate(datasource);
    }


    public int createPlayer(PlayerVo playerVo) {
        return 0;
    }

    public void updatePlayer(PlayerVo playerVo) {

    }

    public void deletePlayer(int playerId) {

    }

    public PlayerVo findPlayerByPlayerId(int playerId) {
        return null;
    }

    public List<PlayerVo> findPlayersByTeamId(int teamId) {
        return null;
    }

    public PlayerVo findPlayerByPlayerName(String playerName) {
        return null;
    }
}
