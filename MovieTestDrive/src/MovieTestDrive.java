/*The purpose of this application is to demonstrate how objects instantiated in the main method can become 
 *their own unique object with the fundamental attributes and methods derived from it's class.
 *
 *This also demonstrates how a class can be used a "TestDrive" if it contains the main method, to see
 *how objects behave after instantiating them with their own unique characteristics based on other classes.
 */
import java.util.*;

public class MovieTestDrive
{
	public static void main(String[] args)
	{
		Movie one = new Movie();
		one.title = "The Notebook";
		one.genre = "Romance";
		one.rating = 3;
		
		Movie two = new Movie();
		two.title = "Office Space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();

		Movie three = new Movie();
		three.title = "Good Will Hunting";
		three.genre = "Uplifting";
		three.rating = 5;
		three.playIt();
	}
}
