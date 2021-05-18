package day6.task1;

public class Printer extends ElectronicDevice implements Bluetooth {
     private  String currentFile;
	@Override
	public void doBluetoothConnection() {
		System.out.println("printer is connected to bluetooth");
		
	}

	@Override
	public void doSHareFiles() {
		
		System.out.println("currently sharing:"+currentFile);
	}

	@Override
	public void doSwitchOn() {
		System.out.println("Printer is Switched on");
	}

	@Override
	public void doSwitchOff() {
			System.out.println("Printer is turned off");
		
	}
	public void doPrinting(String currentFile) {
		this.currentFile = currentFile;
		//System.out.println("Printing");
		
	}

}
