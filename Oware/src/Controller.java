
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

	public Move makeMoveForCupNumber(int pitNumber)
	{
		//active = Board.getPit(pitNumber);

		return new Move();
	}
	
	private Player nextPlayer() {
		int playerToMove = (this.playerToMove +1) % 1;
		return this.players[playerToMove];
				
	}

	public boolean isGameOver() {
		return player0.getScore()>24 || player1.getScore()>24 || !board.hasValidMoves();
	}
}
