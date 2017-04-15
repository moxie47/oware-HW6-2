
public class Controller
{

	private final Player player0;
	private final Player player1;
	private int playerToMove;
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

	private Pit active;

	public boolean makeMoveStartingAt(int pitNumber)
	{
		//active = Board.getPit(pitNumber);
		active = board.getPit(pitNumber);
		StdOut.println("Move starts at pit number " + pitNumber);

		int numSeeds = active.getNumSeeds();
		int lastPit = active.startSowing();
		
		StdOut.println("Sowing in ccw direction...");
		
		StdOut.println("All seeds sown.");
		//check scoring opportunities at lastpit?
		return true;
	}
	
	private Player nextPlayer() {
		int playerToMove = (this.playerToMove +1) % 1;
		return this.players[playerToMove];
				
	}

	public boolean isGameOver() {
		return player0.getScore()>24 || player1.getScore()>24 || !board.hasValidMoves();
	}
}
