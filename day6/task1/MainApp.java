package day6.task1;

public class MainApp {
	int index = 0;
public static void main(String[] args) {
		MainApp obj = new MainApp();
		
		ElectronicDevice device[] = new ElectronicDevice[4000]; 
		device[obj.index++] = new MobilePhone();
		device[obj.index++] = new Printer();
        device[obj.index++] = new Airpods();
        for(int i = 0; i < obj.index; i++) {
        	obj.doThings(device[i]);
        }
		
	}
	
	public void doThings(ElectronicDevice device)
	{   System.out.println("------------------");
		device.doSwitchOn();
		
		if(device instanceof MobilePhone)
		{
			MobilePhone phone = (MobilePhone)device;
			phone.setFile("Mydoc.txt");
			phone.doSHareFiles();
		}
		if(device instanceof Printer)
		{   
			((Printer)device).doPrinting("c:\\MyDoc.txt");
			((Printer)device).doSHareFiles();
			
		}
		if(device instanceof Airpods) {
			Airpods airpods = (Airpods)(device);
			airpods.setVolumeValue(15);
			airpods.decreaseVolume();
			airpods.decreaseVolume();
			airpods.decreaseVolume();
			airpods.increaseVolume();
			System.out.println("Current volume:"+airpods.getVolumeValue());
		}
		device.doSwitchOff();
		
	}
}
