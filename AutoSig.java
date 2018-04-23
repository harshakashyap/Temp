import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AutoSig extends Applet implements Runnable {

	String color;
	int x;
	public void init()
	{
		color = "red";
		x=0;
		new Thread(this).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			if(x<=0 && color=="red")
			{
				color = "green";
				x=40;
			}
			else {
				color = "red";
				x=20;
			}
			while(x!=0)
			{
				x-=1;
				repaint();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void paint(Graphics G)
	{
		G.drawString(x+"", 50,50);
		if(color=="red")
		{
			G.setColor(Color.RED);
			G.fillOval(100,100,100,100);
		}
		else {
			G.setColor(Color.GREEN);
			G.fillOval(100,100,100,100);
		}
	}
}
