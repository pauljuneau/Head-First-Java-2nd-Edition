import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum >= 1) {
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer!");
			System.out.println("Take one down");
			System.out.println("And pass it around!");
			
			beerNum--;
			
			if (beerNum == 0) { break; }
			
			if (beerNum == 1) {
				word = "bottle";
			}
			else {
				word = "bottles";
			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			
		}
		
		System.out.println("No more bottles of beer on the wall");
	}
}
