import java.util.Random;

public class Oware
{ 
	private final Controller controller;
	
	public Oware(){
		this.controller=new Controller();
	}

	public static void main(String[] args)
	{
		StdOut.println("Welcome to Oware.");
		StdOut.println("Each student will fork the starting");
		StdOut.println("https://github.com/evlevel/oware repo");
		StdOut.println("into their own GitHub clone...");
		
		Oware game = new Oware();
		
		game.play();
	}
	public void play(){
		while (!controller.isGameOver()){
			int pitNumber;
			//Human has pits 0-5 and computer has pits 6-11.
			if (controller.getPlayerToMove().isHuman()){
				StdOut.println("enter Pit NUmber to sow from");
				pitNumber = StdIn.readInt();
				
			} else {
				Random r = new Random();
				int Low = 6;
				int High = 11;
				pitNumber = r.nextInt(High-Low) + Low; 
			}
			controller.makeMoveStartingAt(pitNumber);
			controller.movePlayToNextPlayer();
		}
	}
}
