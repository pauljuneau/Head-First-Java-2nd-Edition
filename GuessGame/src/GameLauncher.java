/* This application is to highlight the basics of instantiating
 * unique objects from a class, and how the main method acts
 * like a conductor.
 * The game has 3 players who are assigned random numbers 0 - 9.
 * A target number is another randomly generated number 0 - 9.
 * It checks if any of the player objects have the target number.
 * If they do, it prints who does and declares that the game has 
 * been won. If the players don't have a number matching the target,
 * then the players have new random numbers assigned. 
 * This loop continues until a player's number matches the target number.
 */
import java.util.*;

public class GameLauncher
{
	public static void main(String[] args)
	{
		GuessGame game = new GuessGame();
		game.startGame();
	}
}
