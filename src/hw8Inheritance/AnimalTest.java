package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("-------");

		Mammal mammal = new Mammal();
		mammal.mamalInfo();
		animal.animalInfo();
		System.out.println("_____");

		Dog dog = new Dog();
		dog.dogInfo();
		mammal.mamalInfo();
		animal.animalInfo();
		System.out.println("----------");

		BullDog bulldog = new BullDog();
		bulldog.bullDogInfo();
		dog.dogInfo();
		mammal.mamalInfo();
		animal.animalInfo();
		System.out.println("________");

		Birds birds = new Birds();
		birds.birdsInfo();
		animal.animalInfo();
		System.out.println("________");

		Robin robin = new Robin();
		robin.robinInfo();
		birds.birdsInfo();
		animal.animalInfo();
		System.out.println("--------");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		animal.animalInfo();
		System.out.println("-----");

		Snake snake = new Snake();
		snake.snakeInfo();
		reptile.reptileInfo();
		animal.animalInfo();
		System.out.println("-----");

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		snake.snakeInfo();
		reptile.reptileInfo();
		animal.animalInfo();
		System.out.println("\n-----");
		
		
		/* Example of Single Inheritance : 
		 * Bird is the the parent class, Robin is the child class.
		 * Bird-> Robin
		 * 
		 * Example of Multilevel Inheritance:
		 * Animal -> Reptile -> Snake -> Cobra .
		 * 
		 * Example of Hierarchical inheritance :
		 *                 Animal
		 *                 
		 *       Reptile   Mammal   Bird  
		 * 
		 * 
		 */
		

	}
}
