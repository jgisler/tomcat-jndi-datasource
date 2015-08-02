package org.gislers.tomcat.jndi.dao.impl;

import org.gislers.tomcat.jndi.dao.TeamDao;
import org.gislers.tomcat.jndi.dao.vo.TeamVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeamDaoImpl extends BaseDaoImpl implements TeamDao {

    public void save(TeamVo teamVo) {
        persist(teamVo);
    }

    @Override
    public void deleteByTeamId(int teamId) {

    }

    public List<TeamVo> getAll() {
        return null;
    }

    public TeamVo findByTeamId(int teamId) {
        return null;
    }

    public TeamVo findByPlayerId(int playerId) {
        return null;
    }

    public TeamVo findByTeamName(String teamName) {
        return null;
    }
}
