package org.gislers.tomcat.jndi.dao.statement;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreatePlayerPreparedStatement implements PreparedStatementCallback<Integer> {

    private String sql = "insert into player ( 'player_id', ''  ) values ( :playerId, : )";

    public Integer doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
        return null;
    }
}
