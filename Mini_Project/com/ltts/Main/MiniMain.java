package com.ltts.main;

import java.sql.Date;
import java.util.Scanner;

import com.ltts.dao.PlayerDAO;
import com.ltts.dao.TeamDAO;
import com.ltts.models.Player;
import com.ltts.models.Team;

public class MiniMain {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PlayerDAO po=new PlayerDAO();
		TeamDAO to=new TeamDAO();
		System.out.println("Main Menu");
		System.out.println("1. Select Table (Specific)");
		System.out.println("2. Update Table"); 
		System.out.println("3. Select Table");
		System.out.println("4. Select Player by team");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("1. Search by id:");
			System.out.println("2. Search by name:");
			int ty=sc.nextInt();
			if(ty==1)
			{
				System.out.println("Enter Id to search");
				int nu=sc.nextInt();
				po.getAll(nu);
			}
			else if(ty==2)
			{
				System.out.println("Enter player name to search");
				String name=sc.next();
				po.getAll(name);
			}
			
		}
		else if(n==2)
		{
			System.out.println("Update menu:");
			System.out.println("1. Update player");
			System.out.println("2. Update team");
			int ty=sc.nextInt();
			if(ty==1)
			{
				System.out.println("Enter the id to changed");
				int nu=sc.nextInt();
				System.out.println("Enter the new player name");
				String name=sc.next();
				Boolean bo=po.updateplayer(nu,name);
				if(bo==true)
				{
					System.out.println("Not updated....");
				}
				else
					System.out.println("Updated Successfully...");
				
			}
			else if(ty==2)
			{
				System.out.println("Enter the id to changed");
				int nu=sc.nextInt();
				System.out.println("Enter the new team name");
				String name=sc.next();
				Boolean bo=to.updateteam(nu,name);
				if(bo==true)
				{
					System.out.println("Not updated....");
				}
				else
					System.out.println("Updated Successfully...");
				
			}
		}
		else if(n==3)
		{
			System.out.println("Search (non-specific) menu:");
			System.out.println("1. Select team");
			System.out.println("2. Select player");
			int ty=sc.nextInt();
			if(ty==1)
			{
				po.getPlayer();
			}
			else if(ty==2)
			{
				to.getTeam();
			}
		}
		else if(n==4)
		{
			System.out.println("Enter the team name to be searched:");
			String tn=sc.next();
			po.getPlayerbt(tn);
		}
		else if(n==6)
		{
			System.out.println("Insert menu (Admin)");
			System.out.println("1.Insert in player");
			System.out.println("2. Insert in team");
			int nu=sc.nextInt();
			if(nu==1)
			{
				int id=sc.nextInt();
				String name=sc.next();
				int tid=sc.nextInt();
				String d=sc.next();
				Date dob=Date.valueOf(d);
				String sk=sc.next();
				int nom=sc.nextInt();
				Boolean bo=po.insertplayer(new Player(id,name,tid,dob,sk,nom));
				if(bo==true)
				{
					System.out.println(" Not Done");
				}
				else
					System.out.println("Done");
			}
			else if(n==2)
			{
				int id=sc.nextInt();
				String name=sc.next();
				String d=sc.next();
				String sk=sc.next();
				int nom=sc.nextInt();
				Boolean bo=to.insertteam(new Team(id,name,d,sk,nom));
				if(bo==true)
				{
					System.out.println("Not Done");
				}
				else
					System.out.println("Done");
			}
		}
		else if(n==5)
		{
			System.out.println("Enter the team you want to search:");
			String name=sc.next();
			System.out.println("Enter the skill");
			String sk=sc.next();
			po.getPlayerst(sk, name);
		}
		
	}

}
