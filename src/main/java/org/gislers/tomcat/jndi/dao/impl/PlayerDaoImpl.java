package org.gislers.tomcat.jndi.dao.impl;

import org.gislers.tomcat.jndi.dao.PlayerDao;
import org.gislers.tomcat.jndi.dao.vo.PlayerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class PlayerDaoImpl extends BaseDaoImpl implements PlayerDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDatasource( DataSource datasource ) {
        jdbcTemplate = new NamedParameterJdbcTemplate(datasource);
    }


    public int createPlayer(PlayerVo playerVo) {
        String sql = "insert into player('player_id', 'player2team_id', 'player_name', 'player_number'  ) " +
                "values( null, :player2teamId, :playerName, :playerNumber )";

        return 0;
    }

    @Override
    public void save(PlayerVo playerVo) {
        persist(playerVo);
    }

    @Override
    public void deleteByPlayerId(int playerId) {

    }

    @Override
    public PlayerVo findByPlayerId(int playerId) {
        return null;
    }

    @Override
    public List<PlayerVo> findByTeamId(int teamId) {
        return null;
    }

    @Override
    public PlayerVo findByPlayerName(String playerName) {
        return null;
    }
}
