package day6.task1;

public class Airpods extends ElectronicDevice{
	
     private int volumeValue;
     final int maxVolume = 25;
      
	public int getVolumeValue() {
	return volumeValue;
    }

    public void setVolumeValue(int volumeValue) {
	this.volumeValue = volumeValue;
    }

	@Override
	public void doSwitchOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSwitchOff() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void increaseVolume() {
		if(volumeValue < maxVolume)
		this.volumeValue = volumeValue+1;
	}
	
	public void decreaseVolume() {
		this.volumeValue = volumeValue-1;
	}
   
}
