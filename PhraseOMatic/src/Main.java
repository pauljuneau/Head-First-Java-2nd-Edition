/*This application generates a marketing phrase using a combination of random buzz words in three
 *string arrays.
 */
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		//make threee sets of words to choose from.
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", 
								"web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
								"clustered", "branded", "outside-the-box", "positioned", "networked", 
								"focused", "leveraged", "aligned", "targeted", "shared", "cooperative", 
								"accelerated"};
								
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", 
								  "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
		
		//determine amount of words in each word list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//randomly select word (element position of string array) from wordList#
		//NOTE: Math.random() generates a double by default, (int) rounds the number to nearest integer
		int rand1 = (int) (Math.random() * oneLength); 
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		//build the phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		//print it out
		System.out.println("Folks, what we need is a " + phrase);
	}
}
