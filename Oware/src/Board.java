
public class Board
{
	
	private Pit[] allPits;
	
	public Board()
	{
		allPits = new Pit[12];
		for (int i=0;i<12; i++) {
			Pit newPit = new Pit(i, (int) i/6);
			allPits[i] = newPit;
		}

		for (int i=0;i<12; i++) {
			Pit pit = allPits[i];
			Pit pitPrev = allPits[(12 + i-1)%12]; 
			Pit pitNext = allPits[(i+1)%12];
			pit.setNextPit(pitNext);
			pit.setPrevPit(pitPrev);
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public Pit getPit(int pitnum)
	{
		return allPits[pitnum];
	}
	
	public boolean hasValidMoves(){
		return true;
	}
}
