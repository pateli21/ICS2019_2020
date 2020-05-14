import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program
{
	public static void main(String[] args)
    {
		JFrame frame = new JFrame("Example");
		frame.setResizable(false);
        MyPanel panel=new MyPanel();
        panel.setPreferredSize(new Dimension(600,600));
		frame.add(panel);
        panel.addMouseMotionListener(panel);
        panel.addMouseListener(panel);
        frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MyPanel extends JPanel implements MouseMotionListener, MouseListener
{
    public int x=262;
    public int y=40;
    public int w=25;
    public int count = 0;
    
    public void paint(Graphics g)
    {
        //super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);        
        g2.setColor(Color.YELLOW);
        g2.fillRect(0,0,getWidth(),getHeight());
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(20));
		g2.fillOval(x,y,w,w);
		board(g2);
		win(g2);
		
		System.out.println(g2.getColor());

	}
	
	public void board(Graphics2D g2)
	{
		g2.drawLine(50, 50, 250, 50);
		g2.drawLine(300, 50, 550, 50);
		g2.drawLine(50, 50, 50, 550);
		g2.drawLine(550, 50, 550, 550);
		g2.drawLine(50, 550, 300, 550);
		g2.drawLine(350, 550, 550, 550);
		g2.drawLine(150, 50, 150, 100);
		g2.drawLine(350, 50, 350, 100);
		g2.drawLine(450, 50, 450, 100);
		g2.drawLine(200, 100, 350, 100);
		g2.drawLine(100, 100, 100, 150);
		g2.drawLine(200, 100, 200, 150);
		g2.drawLine(400, 100, 400, 200);
		g2.drawLine(500, 100, 500, 200);
		g2.drawLine(100, 150, 200, 150);
		g2.drawLine(250, 150, 350, 150);
		g2.drawLine(400, 150, 500, 150);
		g2.drawLine(250, 150, 250, 200);
		g2.drawLine(50, 200, 400, 200);
		g2.drawLine(350, 200, 350, 300);
		g2.drawLine(450, 200, 450, 400);
		g2.drawLine(100, 250, 300, 250);
		g2.drawLine(400, 250, 550, 250);
		g2.drawLine(450, 300, 500, 300);
		g2.drawLine(400, 400, 500, 400);
		g2.drawLine(500, 400, 500, 450);
		g2.drawLine(250, 300, 350, 300);
		g2.drawLine(250, 300, 250, 350);
		g2.drawLine(250, 350, 200, 350);
		g2.drawLine(50, 400, 200, 400);
		g2.drawLine(150, 300, 150, 400);
		g2.drawLine(150, 300, 200, 300);
		g2.drawLine(200, 250, 200, 300);
		g2.drawLine(500, 350, 550, 350);
		g2.drawLine(500, 500, 500, 550);
		g2.drawLine(50, 300, 100, 300);
		g2.drawLine(100, 300, 100, 350);
		g2.drawLine(350, 500, 350, 550);
		g2.drawLine(300, 550, 300, 450);
		g2.drawLine(250, 500, 300, 500);
		g2.drawLine(300, 450, 450, 450);
		g2.drawLine(400, 450, 400, 500);
		g2.drawLine(450, 450, 450, 500);
		g2.drawLine(400, 300, 400, 350);
		g2.drawLine(300, 350, 400, 350);
		g2.drawLine(100, 500, 200, 500);
		g2.drawLine(350, 350, 350, 450);
		g2.drawLine(100, 450, 150, 450);
		g2.drawLine(100, 450, 100, 500);
		g2.drawLine(200, 500, 200, 450);
		g2.drawLine(200, 450, 250, 450);
		g2.drawLine(250, 450, 250, 400);
		g2.drawLine(250, 400, 300, 400);
		g2.drawLine(300, 400, 300, 350);		
	}
	
	
	public void win(Graphics2D g2)
	{
		if(count == 1) 
		{
			g2.setColor(Color.PINK);
			g2.fillRect(0,0,getWidth(),getHeight());
			g2.setColor(Color.BLACK);
			g2.setFont(new Font("TimesRoman", Font.PLAIN, 25));
			g2.drawString("congrats", 227, 275);
		}
		
	}
	
    
    public void mouseDragged(MouseEvent e){}
    public void mouseMoved(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        repaint();
    }
    
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e)
    {
        if(x > 300 && x < 350 && y > 525) 
		{
			count++;
		}	
    }
    
    public void mouseReleased(MouseEvent e){}
    
}
