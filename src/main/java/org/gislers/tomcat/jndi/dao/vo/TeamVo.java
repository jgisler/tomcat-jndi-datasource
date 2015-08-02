package org.gislers.tomcat.jndi.dao.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@NamedQueries({
    @NamedQuery(
        name  = "findTeamByTeamName",
        query = "from Team team where team.teamName = :teamName"
    )
})

@Entity
@Table(name="Team", uniqueConstraints={@UniqueConstraint(columnNames={"TEAM_ID"})})
public class TeamVo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="TEAM_ID", nullable=false, unique=true, length=11)
    private int teamId;

    @Column(name="TEAM_NAME", nullable=false)
    private String teamName;

    public TeamVo() {
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
