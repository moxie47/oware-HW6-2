
public class Pit
{
	private int numSeeds;
	private final int ID;
	private Pit nextPit;
	private Pit prevPit;
	private final int rowNum;
	
	public Pit(int ID, int rowNum)
	{
		this.ID=ID;
		this.rowNum=rowNum;
	}

	public int getNumSeeds()
	{
		return this.numSeeds;
	}

	public void setNumSeeds(int num)
	{
		this.numSeeds = num;
	}

	public Pit getNextPit() {
		return nextPit;
	}

	public void setNextPit(Pit nextPit) {
		this.nextPit = nextPit;
	}

	public Pit getPrevPit() {
		return prevPit;
	}

	public void setPrevPit(Pit prevPit) {
		this.prevPit = prevPit;
	}

	public int getID() {
		return ID;
	}

	public int getRowNum() {
		return rowNum;
	}

	public static void main(String[] args)
	{
		// test the Pit...

		Pit test = new Pit(3,1);
		test.setNumSeeds(4);

	}

}
