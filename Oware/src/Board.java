
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
	
	public void printAll()
	{
		StdOut.println ("\n#   11  -  10  -   9  -   8  -   7  -   6    #");	
		StdOut.print("|<-");
		
		for (int i=11; i>5; i--)
			StdOut.printf  (" %2d <- ", allPits[i].getNumSeeds());
		
		StdOut.println("|\n|    ===================================     |");
		StdOut.print("|->");
		
		for (int i=0; i<6; i++)
			StdOut.printf  (" %2d -> ", allPits[i].getNumSeeds());
		StdOut.println("|");
		
		StdOut.println ("#    0  -   1  -   2  -   3  -   4  -   5    #");		

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
