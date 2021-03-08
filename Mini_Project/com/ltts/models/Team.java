package com.ltts.models;

public class Team {
	
	private int teamid;
	private String teamname;
	private String ownerName;
	private String coachName;
	private int playerId;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public Team() {
		super();
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public Team(int teamid, String teamname, String ownerName, String coachName, int playerId) {
		super();
		this.teamid = teamid;
		this.teamname = teamname;
		this.ownerName = ownerName;
		this.coachName = coachName;
		this.playerId = playerId;
	}
	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", teamname=" + teamname + ", ownerName=" + ownerName + ", coachName="
				+ coachName + ", playerId=" + playerId + "]";
	}
	
	
	
	
	
}
