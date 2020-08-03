package ipl;

public class MatchBO {
	public Match createMatch(String data, Team[] teamList) {
		String tempMatch[]=data.split(",");
		Team t=new Team();
		Team t1=new Team();
		for(Team tm:teamList) {
			if(tm.getName().equals(tempMatch[1])) {
				t.setName(tempMatch[1]);
				break;
		}
			
		}	
		for(Team tm:teamList) {
			if(tm.getName().equals(tempMatch[2])) {
				t1.setName(tempMatch[2]);
				break;
		}
			
		}	

		Match match=new Match(tempMatch[0], t, t1, tempMatch[3]);
		String output=String.format("%-15s %-15s %-15s %s", tempMatch[0], t.getName(), t1.getName(), tempMatch[3]);
		System.out.println(output);
		return match;
	}
	public Team findTeam(String matchDate, Match[] matchList) {
		Team team=null;
		Team team1=null;
		for(Match m:matchList) {
			if(m.getDate().equals(matchDate)) {
				team=m.getTeamone();
				team1=m.getTeamtwo();
			System.out.print(team.getName()+","+team1.getName());
			System.out.println();
				break;
			}
		}
		return team;
	}
	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {

		for(Match match :matchList) {
			if((match.getTeamone().getName().equals(teamName))) {
				System.out.println(match.getDate()+"\t"+match.getTeamone().getName()+"\t"+match.getTeamtwo().getName()+"\t"+match.getVenue());
				break;
			}	
		}
		
		for(Match match :matchList) {
			if((match.getTeamtwo().getName().equals(teamName))) {
				System.out.println(match.getDate()+"\t"+match.getTeamone().getName()+"\t"+match.getTeamtwo().getName()+"\t"+match.getVenue());
			}
				break;
			}	
		}
		
	}

