import java.applet.Applet;
import java.awt.Graphics;

public class Banner extends Applet implements Runnable {

	String x;
	int num;
	public void init()
	{
		x = "Nitte Meenakshi";
		num=500;
		new Thread(this).start();
		
	}
	public void paint(Graphics G) {
		G.drawString(x, num, 100);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(num<=0)
				num=500;
			else num-=10;
		
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
