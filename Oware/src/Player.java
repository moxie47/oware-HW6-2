
public class Player
{
	
	private final Storehouse store = new Storehouse();
	private final boolean isHuman;
	
	public Player(boolean isHuman){
		this.isHuman=isHuman;
	}
	
	public boolean isHuman() {
		return isHuman;
	}

	public Storehouse getStore() {
		return store;
	}

	public int getScore() {
		return this.store.getNumSeeds();
	} 

}
