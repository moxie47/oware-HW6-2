
public class Board
{
	private final Pit[] allPits; 
	
	public Board(){
		allPits = new Pit[12];
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public Pit getPit(int pitnum)
	{
		return allPits[pitnum];
	}

}
