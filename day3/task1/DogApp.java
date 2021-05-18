package day3.task1;
import java.util.*;

public class DogApp {
	
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Dog obj = new Dog();
	while(true) {
		   System.out.println("Enter dog's name:");
		   obj.setName(s.next());
		   System.out.println("Enter dog's age:");
		   obj.setAge(s.nextInt());
		   System.out.println("Enter dog's weight:");
		   obj.setWeight(s.nextInt());
		   //obj.doFeedAnimal();
		   obj.playGames();
		   if(obj.isStatus())
			   System.out.println("Dog is playing");
		   else
			   System.out.println("Dog cannot play as weight of dog is"+obj.getWeight());
		   if(obj.isStatus())
			   System.out.println("Dog is has stopped playing");
	}
}
}
