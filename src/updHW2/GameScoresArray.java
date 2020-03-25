package updHW2;

class PlayerAlist {
	
	String name;
	int highScore;
	
	 public PlayerAlist() {
		
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", highScore=" + highScore + "]";
	}


	public PlayerAlist(String name, int highScore) {
		
		this.name = name;
		this.highScore = highScore;
	}

}

public class GameScoresArray {
	
	
	PlayerAlist[] players;
	
	int numOfPlayers;//exists player in the list
	int capacity;//capacity of array
	
	
	public GameScoresArray(int capacity) {
		
		this.capacity = capacity;
	}
	

	public void print() {
		System.out.println("Talha");
		for (int i = 0; i < players.length; i++) {
      
			System.out.print("Players list : "+players[i]);
    }
 }
	
	
	public void findPlayers(PlayerAlist player,int a,int b) {
		System.out.println("Talha");
		for(int i=0;i<players.length;i++) {
			
			if(b>players[i].highScore && players[i].highScore>=a ) 
			{
				
				players[i].toString();
				
			}
		}
	}

	
	public void updatePlayer(PlayerAlist player,int newScore){
		
		if(newScore>player.highScore) {
			player.highScore= newScore;
		}
	}
	
	
	
	public boolean isPlayerExists(PlayerAlist player) {
		
		for (PlayerAlist kontrol : players) {
				if(kontrol.name == player.name) {
					return true;
				}
			}
		
		return false;	
	}
	
	
	
	public void add(PlayerAlist player) {
		
		if(isPlayerExists( player )) {
			System.out.println("Your name is already selected.You can choose other name...");
				
		  }

	    else if(this.players.length >= capacity) {
			  System.out.println("List is full...");
			  
		  }
		  
		else {
			
			this.players[this.numOfPlayers + 1] = player;
			numOfPlayers++;
				 
				     
		  }
	}
	
	
	
	
	
	
	


	
	
	
	
}
