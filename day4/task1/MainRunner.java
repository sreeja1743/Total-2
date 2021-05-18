package day4.task1;

public class MainRunner {
	Car cars[] = new Car[100];
	int index = 0;
    public static void main(String[] args) {
    	
    	Engine e1 = new Engine(800);
    	Engine e2 = new Engine(1800);
    	Car car1 = new Car(e1);
    	car1.moveCarForward();
    	//car1.playMusic();
    	Car arr[] = new Car[3];
    	Car obj1 = new Car(e1);
    	obj1.setCarName("Honda");
    	obj1.setCarPower(1000);
    	Car obj2 = new Car(e2);
    	Car obj3 = new Car(e1);
    	obj2.setCarPower(1600);
    	obj2.setCarName("tata");
        obj3.setCarName("Kwid");
    	obj3.setCarPower(1800);
    	// insert into an array
    	arr[0] = obj1;
    	arr[1] = obj2;
    	arr[2] = obj3;
    	// ---- iterate the array
    	// approach - 1
    	/*for (int i = 0; i < arr.length; i++) {
    	System.out.println(arr[i].getCarName()+" - "+arr[i].getCarPower());
    	}
    	System.out.println("-----------------------------------");
    	// --- appraoch 2
    	for (Car car : arr) {
    	System.out.println(car.getCarName()+" --- "+car.getCarPower());
    	}*/
    	for(Car car: arr) {
    		if(car.getCarPower() > 1500)
    			System.out.println(car.getCarName());
    	}
    	MainRunner m = new MainRunner();
    	m.addCar(car1);
    	m.addCar(obj1);
    	m.addCar(obj2);
    	m.addCar(obj3);
    	m.print();
	
	}
    public void addCar(Car car) {
    	cars[index++] = car;
    	
    }
    public void print() {
    	for(int i = 0; i< index; i++)
    		System.out.println("Car name:"+cars[i].getCarName());
    }
}
