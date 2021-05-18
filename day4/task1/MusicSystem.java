package day4.task1;

public class MusicSystem {
    	//private boolean isSongAvailable;
    	//private String songName;
      
    	public MusicSystem(){

    		
    	}
	
	
	public boolean startPlaying(String song) {
		if(song.equalsIgnoreCase("xyz")) {
			return true;
		}
		else if(song.equalsIgnoreCase("yz")) {
			return true;
		}
		else if(song.equalsIgnoreCase("x")) {
			return true;
		}
		else
		return false;	
	}
}
