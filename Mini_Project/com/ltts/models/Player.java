package com.ltts.models;

import java.sql.Date;

public class Player {
	
	private int Playerid;
	private String playername;
	private int teamid;
	private Date dob;
	private String skill;
	private int noofmatches;

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNoofmatches() {
		return noofmatches;
	}
	public void setNoofmatches(int noofmatches) {
		this.noofmatches = noofmatches;
	}
	public Player() {
		super();
	}
	public int getPlayerid() {
		return Playerid;
	}
	public void setPlayerid(int playerid) {
		Playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public Player(int playerid, String playername, int teamid, Date dob, String skill, int noofmatches) {
		super();
		Playerid = playerid;
		this.playername = playername;
		this.teamid = teamid;
		this.dob = dob;
		this.skill = skill;
		this.noofmatches = noofmatches;
	}
	@Override
	public String toString() {
		return "Player [Playerid=" + Playerid + ", playername=" + playername + ", teamid=" + teamid + ", dob=" + dob
				+ ", skill=" + skill + ", noofmatches=" + noofmatches + "]";
	}

}
