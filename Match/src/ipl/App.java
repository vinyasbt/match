package ipl;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String continueoption=null;
		Player[] player=new Player[10];
		Team[] team=new Team[10];
		Match[] match =new Match[10];
		int playerarraycount=0,teamarraycount=0,matcharraycount=0;
		PlayerBO playerbo=new PlayerBO();
		TeamBO teambo=new TeamBO();
		MatchBO matchbo=new MatchBO();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the player count");
		int playercount=sc.nextInt();
		for(int i=0;i<playercount;i++) {
			System.out.println("enter player details");
			String playerdetails=sc.next();
			Player temp=playerbo.createPlayer(playerdetails);
			player[playerarraycount]=temp;
			playerarraycount++;
			System.out.println("player created" +temp);
		}
		System.out.println("enter the Team count");
		int teamcount=sc.nextInt();
		for(int i=0;i<teamcount;i++) {
			System.out.println("enter team details");
			String teamdetails=sc.next();
			Team t=teambo.createTeam(teamdetails, player);
			team[teamarraycount]=t;
			teamarraycount++;
			System.out.println("team created"+t);
	}
System.out.println("enter the match count");
int matchcount=sc.nextInt();
for(int i=0;i<matchcount;i++) {
	System.out.println("enter match details");
	String matchdetails=sc.next();
	Match m=matchbo.createMatch(matchdetails, team);
	match[matcharraycount]=m;
	matcharraycount++;
	System.out.println("match created"+m);
}
do {
	System.out.println("1.Find Team ");
	System.out.println("2.Find All Matches In A Specific Venue ");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:System.out.println("enter date");
	String matchdate=sc.next();
	matchbo.findTeam(matchdate, match);
	break;
	case 2:System.out.println("Enter Team Name ");
	String teamname=sc.next();
	matchbo.findAllMatchesOfTeam(teamname, match);
	break;
	
	}
	System.out.println("do you want to continue yes or no");
	continueoption=sc.next();
}while(continueoption.equals("yes"));
System.out.println("exit");
}
}
