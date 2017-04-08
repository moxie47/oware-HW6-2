
public class Controller
{

	private Player player0;
	private Player player1;
	private Player playerToMove;
	private Board board;
	
	public Controller(Board b)
	{
		board = b;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	private Pit active;

	public boolean makeMoveStartingAt(int pitNumber)
	{
		active = board.getPit(pitNumber);
		StdOut.println("Move starts at pit number " + pitNumber);

		int numSeeds = active.getAllSeeds();
		StdOut.println("Removed " + numSeeds + " seeds");
		
		StdOut.println("Sowing in ccw direction...");
		
		while (numSeeds > 0)
		{
			active = active.getNext();
			StdOut.println("Processing next pit=> " + active.getPitNumber());
			
			active.sowOneSeed();
			StdOut.println("Sowing one seed to it, giving its new count as: " + active.getNumSeeds());
			
			numSeeds--;
		}
		
		StdOut.println("All seeds sown.");
		
		return true;
	}

}
