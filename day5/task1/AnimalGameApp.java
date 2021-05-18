package day5.task1;

public class AnimalGameApp {
public static void main(String[] args) {
		
		AnimalGameApp app=  new AnimalGameApp();
		
		Dog dog = new Dog(4,20f);
		app.doAnimalThings(dog, 2);
		
		System.out.println(" ------------------------");
		
		Cat cat = new Cat(4,8f);
		app.doAnimalThings(cat, 2);
		
		System.out.println("-------------------------");
		Tiger tiger = new Tiger(4, 50f);
		app.doAnimalThings(tiger, 3);
		
		System.out.println("-------------------------");
		Elephant elephant = new Elephant(4, 100f);
		app.doAnimalThings(elephant, 3);
		
	
	}
	
	public void doAnimalThings(Animal a,int food)
	{
		a.doWalk();
		a.doFeed(food);
		// ----------  instanceOf ----
		if(a instanceof Dog)  
			{
			   // call all dog related things
				
				Dog d = (Dog)a; 
				d.doPlayGames();
				
				/*
				 New Object creation will not work , becoz of state management
				Dog abc = new Dog();
				abc.doPlayGames(); 
				*/
			}
		else if (a instanceof Cat )
			{
				Cat cat = (Cat)a;
				cat.doCatThings();
			}
		else if(a instanceof Tiger) {
			Tiger tiger = (Tiger) a;
			tiger.doThingSpecificThings();
		}
		else if(a instanceof Elephant) {
			Elephant elephant = (Elephant) a;
			elephant.drinkingWater();
		}
		
	}
}
