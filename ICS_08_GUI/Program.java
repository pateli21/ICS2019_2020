import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program
{
	public static void main(String[] args)
    {
		JFrame frame = new JFrame("Example");
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
    public int x=0;
    public int y=0;
    public int w=25;
    public int count = 1;
    
    public void paint(Graphics g)
    {
        //super.paint(g);
		Graphics2D g2=(Graphics2D)g;
        g2.setColor(Color.WHITE);
        g2.fillRect(0,0,getWidth(),getHeight());
        if(count == 1) g2.setColor(Color.RED); g2.fillOval(x,y,w,w);
        if(count == 2) g2.setColor(Color.ORANGE); g2.fillOval(x,y,w,w);
        if(count == 3) g2.setColor(Color.YELLOW); g2.fillOval(x,y,w,w);
        if(count == 4) g2.setColor(Color.GREEN); g2.fillOval(x,y,w,w);
        if(count == 5) g2.setColor(Color.BLUE); g2.fillOval(x,y,w,w);
        if(count == 6) g2.setColor(Color.MAGENTA); g2.fillOval(x,y,w,w);
        if(count == 7) {
			g2.setColor(Color.PINK);
			g2.fillRect(0,0,getWidth(),getHeight());
			g2.setColor(Color.BLACK);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
			g2.drawString("eat the rainbow.", 227, 275);
			g2.drawString("be the rainbow.", 229, 305);
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
        if(e.getX()%2 == 0 && e.getY()%2 == 0)w+=50;
        if(e.getX()%2 == 1 && e.getY()%2 == 1)w+=15;
        if(count==7) count = -1;
        count ++;
        repaint();
    }
    public void mouseReleased(MouseEvent e){}
    
}
