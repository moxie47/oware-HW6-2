
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
		

	}
	public void play(){
		while (controller.gameNotOver()){
			
		}
	}
}
