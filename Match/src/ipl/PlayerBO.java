package ipl;

public class PlayerBO {
	Player createPlayer (String data) {
		String temp[]=data.split(",");
		Player player=new Player(temp[0],temp[1],temp[2]);
		return player;
		
	}
}
