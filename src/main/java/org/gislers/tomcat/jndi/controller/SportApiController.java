package org.gislers.tomcat.jndi.controller;

import org.gislers.tomcat.jndi.dao.TeamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportApiController {

    private TeamDao teamDao;

    @Autowired
    public void setTeamDao(TeamDao teamDao) {
        this.teamDao = teamDao;
    }


}
