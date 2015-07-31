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

    public List<Team> getAllTeams() {
        List<Team> teams = null;
        List<TeamVo> teamVos = teamDao.getAllTeams();
        if( teamVos != null ) {
            teams = new ArrayList<Team>(teamVos.size());
            for( TeamVo teamVo : teamVos ) {
                List<PlayerVo> playerVos = playerDao.findPlayersByTeamId(teamVo.getTeamId());
                teams.add( buildTeam(teamVo, playerVos) );
            }
        }
        return teams;
    }

    public Team getTeamByTeamId( int teamId ) {
        TeamVo teamVo = teamDao.getTeamByTeamId(teamId);
        if( teamVo != null ) {
            List<PlayerVo> players = playerDao.findPlayersByTeamId(teamId);
            return buildTeam( teamVo, players );
        }
        return null;
    }

    public List<Player> getPlayersByTeamId( int teamId ) {
        List<Player> players = new ArrayList<Player>();
        players.addAll( buildPlayerList(playerDao.findPlayersByTeamId(teamId)) );
        return players;
    }

    Team buildTeam( TeamVo teamVo, List<PlayerVo> playerVos ) {
        Team team = new Team();
        team.setTeamId(teamVo.getTeamId());
        team.setTeamName(teamVo.getTeamName());
        team.getRoster().addAll( buildPlayerList(playerVos) );
        return team;
    }

    List<Player> buildPlayerList( List<PlayerVo> playerVos ) {
        List<Player> playerList = new ArrayList<Player>();
        if(playerVos != null) {
            for( PlayerVo playerVo : playerVos ) {
                playerList.add(buildPlayer(playerVo));
            }
        }
        return playerList;
    }

    Player buildPlayer( PlayerVo playerVo ) {
        Player player = new Player();
        player.setPlayerId(playerVo.getPlayerId());
        player.setPlayerName(playerVo.getPlayerName());
        player.setPlayerNumber(playerVo.getPlayerNumber());
        player.setTeamId( playerVo.getTeamId() );
        return player;
    }
}
