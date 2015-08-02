package org.gislers.tomcat.jndi.service;

import org.gislers.tomcat.jndi.dao.PlayerDao;
import org.gislers.tomcat.jndi.dao.TeamDao;
import org.gislers.tomcat.jndi.dao.vo.PlayerVo;
import org.gislers.tomcat.jndi.dao.vo.TeamVo;
import org.gislers.tomcat.jndi.service.model.Player;
import org.gislers.tomcat.jndi.service.model.Team;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SportService {

    private static final Logger logger = LoggerFactory.getLogger( SportService.class );

    private TeamDao teamDao;
    private PlayerDao playerDao;

    @Autowired
    public void setTeamDao(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    @Autowired
    public void setPlayerDao(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }


}
