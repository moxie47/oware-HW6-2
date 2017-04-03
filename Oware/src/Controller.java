
public class Controller
{

	private Player player0;
	private Player player1;
	private Player playerToMove;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	private Pit active;
	
	public MoveResult makeMoveForCupNumber (int pitNumber)
	{
		active = Board.getPit(pitNumber);
		
		return new MoveResult();
	}

}
