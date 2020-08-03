package ipl;

public class TeamBO {
	public Team createTeam(String data, Player[] PlayerList) {
		String tempTeam[]=data.split(",");
		Player player=null;
		for(Player p:PlayerList) {
			if(p.getName().equals(tempTeam[1])) {
				player=p;
				break;
			}
		}
		Team team =new Team(tempTeam[0], player);
		return team;
	}
}
