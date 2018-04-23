import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Sig extends Applet implements MouseListener {

	String color;
	public void init() {
		color = "red";
		addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(color=="red")
			color="green";
		else color="red";
		
		repaint();
	}

	public void paint(Graphics G)
	{
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
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
