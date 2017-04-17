
public class Controller
{

	private final Player player0;
	private final Player player1;
	private int playerToMove; //0 or 1 - current index of the array
	private final Player[] players;
	private final Board board; 
	
	public Controller() {
		this.player0 = new Player(true);
		this.player1 = new Player(false);
		players = new Player[]{player0,player1};
		this.board=new Board();
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public Player getPlayerToMove() {
		return players[playerToMove];
	}
	
	public void movePlayToNextPlayer() {
		this.playerToMove = ++playerToMove%2;
	}
	
	public boolean makeMoveStartingAt(int pitNumber)
	{
		Pit active = board.getPit(pitNumber);
		StdOut.println("Move starts at pit number " + pitNumber);

		int numSeeds = active.getNumSeeds();
		int lastPit = active.startSowing();
		
		StdOut.println("Sowing in ccw direction...");
		
		StdOut.println("All seeds sown.");

    board.printAll();

    return true;
	}

	public boolean isGameOver() {
		return player0.getScore()>24 || player1.getScore()>24 || !board.hasValidMoves();
	}
}
