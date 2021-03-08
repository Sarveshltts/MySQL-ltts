package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ltts.config.Config;
import com.ltts.models.Player;
import com.ltts.models.Team;

public class TeamDAO 
{
	
	public boolean insertteam(Team t) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into team values(?,?,?,?,?)");
		ps.setString(2,t.getTeamname());
		ps.setInt(1,t.getTeamid());
		ps.setString(3,t.getOwnerName());
		ps.setString(4,t.getCoachName());
		ps.setInt(5, t.getPlayerId());
		Boolean b=ps.execute();
		return b;
	}
	public boolean updateteam(int id,String name) throws Exception
	{
		Team to=new Team();
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE team SET teamname=? where playerid=?");
		ps.setString(1,name);
		ps.setInt(2,id);
		Boolean b=ps.execute();
		return b;
	}
	public void getTeam() throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("Select * from team");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			int n=rs.getInt(1);
			String name=rs.getString(2);
			String dob=rs.getString(3);
			String sk=rs.getString(4);
			int nom=rs.getInt(5);
			System.out.println(n+" "+name+" "+dob+" "+sk+" "+nom);
			
		}
	}
}
