/**
 * Lab 3-5: TurtleFun.java
 * 
 * @author eric
 *
 */

public class TurtleFun
{

	public static void main(String[] args)
	{
		double x0 = 0.5;
		double y0 = 0.5;
		double a0 = 0.0;
		double step = Math.sqrt(3) / 4;

		Turtle turtle = new Turtle(x0, y0, a0);

		for (int times = 0; times < 26; times++)
		{
			turtle.penDown();
			turtle.goForward(step);
			turtle.turnLeft(120.0);
			turtle.goForward(step);
			turtle.turnLeft(120.0);
			turtle.goForward(step);
			turtle.turnLeft(120.0);
			
			turtle.penUp();
			turtle.turnLeft(30.0);
			turtle.goForward(0.02);
			turtle.turnLeft(-30.0);
			turtle.penDown();
			step = step - 0.02*Math.sqrt(3);
			
		}

	}

}
