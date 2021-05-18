package day4.task1;

//import day4.task1.Car;

public class Demo {
   Car cars[] = new Car[2];
   int i = 0;
   public void insertCar(Car car) {
	     cars[i] = car;
	     i++;
   }
   public  Demo(){
	   
   }
   public void printArray() {
	   for(Car x: cars)
	   System.out.println(x);
   }
}
