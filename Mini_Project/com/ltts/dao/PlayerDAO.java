package com.ltts.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ltts.config.Config;
import com.ltts.models.Player;

public class PlayerDAO 
{
	public void getAll( int id) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("Select p.playername,t.teamname,t.coachname,TIMESTAMPDIFF(YEAR, dob, CURDATE()) AS age from player as p inner join team as t on p.playerid=t.playerid where p.playerid=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			String name=rs.getNString(1);
			String n=rs.getString(2);
			String cn=rs.getString(3);
			String dob=rs.getString(4);
			System.out.println(name+" "+n+" "+cn+" "+dob+"\n");
			
		}
	}
	public void getAll(String name) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("Select p.playername,t.teamname,t.coachname,TIMESTAMPDIFF(YEAR, dob, CURDATE()) AS age from player as p inner join team as t on p.playerid=t.playerid where p.playername=?");
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			String name1=rs.getNString(1);
			String n=rs.getString(2);
			String cn=rs.getString(3);
			String dob=rs.getString(4);
			System.out.println(name1+" "+n+" "+cn+" "+dob+"\n");
			
		}
	}
	public boolean insertplayer(Player p) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into player values(?,?,?,?,?,?)");
		ps.setInt(1,p.getPlayerid());
		ps.setString(2,p.getPlayername());
		ps.setInt(3,p.getTeamid());
		ps.setDate(4, p.getDob());
		ps.setString(5,p.getSkill());
		ps.setInt(6, p.getPlayerid());
		Boolean b=ps.execute();
		return b;
	}
	public boolean updateplayer(int id, String name) throws Exception
	{
		Player po=new Player();
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE player SET playername=? where playerid=?");
		ps.setString(1,name);
		ps.setInt(2,id);
		Boolean b=ps.execute();
		return b;
	}
	public void getPlayer() throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("Select * from player");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			int n=rs.getInt(1);
			String name=rs.getString(2);
			int tid=rs.getInt(3);
			String dob=rs.getString(4);
			String sk=rs.getString(5);
			int nom=rs.getInt(6);
			System.out.println(n+" "+name+" "+tid+" "+dob+" "+sk+" "+nom);
			
		}
	}
	public void getPlayerbt(String tn) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("Select p.playerid,t.teamname,p.playername,p.skill,t.teamid from team as t inner join player p on t.playerid=p.playerid where t.teamname=?");
		ps.setString(1, tn);
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
	public void getPlayerst(String sk1,String name1) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("Select p.playerid,t.teamname,p.playername,p.skill,t.teamid from team as t, player p where (t.playerid=p.playerid) && (t.teamname=? && p.skill=?)");
		ps.setString(1, sk1);
		ps.setString(2, name1);
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
