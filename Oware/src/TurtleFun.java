
/**
 * Lab 3-5: TurtleFun.java
 * 
 * @author eric
 *
 */

import java.awt.Color;

public class TurtleFun
{
	public static int color = 0;

	public static void setColor(Turtle t)
	{
		color++;
		switch (color % 4)
		{
		case 0:
			t.setPenColor(Color.BLACK);
			break;
		case 1:
			t.setPenColor(Color.RED);
			break;
		case 2:
			t.setPenColor(Color.BLACK);
			break;
		case 3:
			t.setPenColor(Color.RED);
			break;
		}
	}

	public static void drawH(Turtle t, double d, int N)
	{
		if (N == 0)
			return;

		// move to upper left H-tip
		t.turnLeft(90);
		t.goForward(d);
		t.turnLeft(-90);
		t.goForward(d);

		setColor(t); // fiddle with the drawing color...

		// draw scaled-down copy of self
		drawH(t, d / 2.0, N - 1);

		// back up to lower-left H-tip
		t.goForward(-2.0 * d);

		setColor(t); // more color
		drawH(t, d / 2.0, N - 1);

		// move to upper-right H-tip

		t.goForward(d);
		t.turnLeft(-90);
		t.goForward(2.0 * d);
		t.turnLeft(90);
		t.goForward(d);

		setColor(t); // color, again
		drawH(t, d / 2.0, N - 1);

		// and back down to lower-right H-tip
		t.goForward(-2.0 * d);

		setColor(t);
		drawH(t, d / 2.0, N - 1);

		// don't forget to store original state of turtle!
		// (same location, same heading)

		t.goForward(d);
		t.turnLeft(90);
		t.goForward(d);
		t.turnLeft(-90);

	}

	public static void main(String[] args)
	{
		Turtle t = new Turtle(0.0, 0.0, 90.0);
		drawH(t, 100.0, 5);

	}

}
