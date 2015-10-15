public class Player
{
	//Initialize player number variable
	int number = 0;
	
	//Assign a number 0 - 9 to number variable
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number);
	}
}
