package day6.task1;
import java.util.*;

public class MobilePhone extends ElectronicDevice implements Wifi,Bluetooth {
   private String file;
   
   Scanner s = new Scanner(System.in);
   
	public String getFile() {
	return file;
   }

    public void setFile(String file) {
	this.file = file;
    }
    
    public void doSelectDevice(String deviceName){
    	System.out.println(file+" has been shared to "+deviceName);
    	
    }
	@Override
	public void doBluetoothConnection() {
		System.out.println("Enter the device to share files");
		doSelectDevice(s.next());
	}

	@Override
	public void doSHareFiles() {
		doBluetoothConnection();
		
	}

	@Override
	public void doSwitchOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSwitchOff() {
		// TODO Auto-generated method stub
		
	}
	public void doCalling()
	{
	   	
	}
	

}
