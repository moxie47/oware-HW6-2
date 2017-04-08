
public class Oware
{
	// the GUI!
	private static Board board;
	private static Controller controller;
	
	/*      11 10 9 8 7 6
	 * 		 p  p p p p p
	 * 
	 * 		 0  1 2 3 4 5
	 * 		 p  p p p p p 
	 */
	
	public static void main(String[] args)
	{
		StdOut.println("Welcome to Oware.");
		StdOut.println("Each student will fork the starting");
		StdOut.println("https://github.com/evlevel/oware repo");
		StdOut.println("into their own GitHub clone...");
		
		StdOut.println("Initializing...");
		
		board = new Board();
		controller = new Controller(board);
		
		StdOut.println("make a move with pit 0");
		
		controller.makeMoveStartingAt(0);
		
	}

}
