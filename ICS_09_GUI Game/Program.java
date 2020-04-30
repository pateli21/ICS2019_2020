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

































//~ public class Program
//~ {
	//~ public static void main(String[] args)
    //~ {
		//~ JFrame frame = new JFrame("Example");
        
        //~ frame.setResizable(false);
        //~ //frame.setUndecorated(true);
        //~ MyPanel panel=new MyPanel();
        //~ panel.setPreferredSize(new Dimension(400,400));
		//~ frame.add(panel);
        //~ panel.addMouseMotionListener(panel);
        //~ panel.addMouseListener(panel);
        //~ panel.updateXY(100,100);
        //~ frame.pack();
		//~ frame.setVisible(true);
		//~ frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//~ }
//~ }

//~ class MyPanel extends JPanel implements MouseMotionListener, MouseListener
//~ {
    //~ LightsOutGame game=new LightsOutGame();
    //~ public int x=0;
    //~ public int y=0;
    //~ public int w=10;
    
    //~ public void paint(Graphics g)
    //~ {
        //~ //super.paint(g);
		//~ Graphics2D g2=(Graphics2D)g;
        //~ g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
        //~ for(int j=0;j<game.HEIGHT;j++)
        //~ {
            //~ for(int i=0;i<game.WIDTH;i++)
            //~ {
                //~ //expression?trueValue:falseValue
                //~ //s+=board[i][j]?"*":".";
                //~ if(game.board[i][j]) g2.setColor(Color.YELLOW);
                //~ else g2.setColor(Color.BLACK);
                //~ int cellWidth=getWidth()/game.WIDTH;
                //~ int cellHeight=getHeight()/game.HEIGHT;
                //~ g2.fillRect(i*cellWidth,j*cellHeight,cellWidth,cellHeight);
            //~ }
        //~ }
        //~ if(game.haveWon())
        //~ {
            //~ g2.setColor(Color.PINK);
            //~ g2.fillRect(0,0,getWidth(),getHeight());
            
            //~ g2.setColor(Color.BLACK);
            //~ g2.setFont(new Font("Ubuntu", Font.PLAIN, 50));
            //~ String text="CONGRATS!"; 
            //~ int textWidth = g.getFontMetrics().stringWidth(text);
            //~ int textHeight = g.getFontMetrics().getHeight();
            
            //~ g2.drawString(text,getWidth()/2-textWidth/2, getHeight()/2+textHeight/3);
            
        //~ }
	//~ }
    
    //~ public void updateXY(int x, int y)
    //~ {
        
        //~ this.x=x;
        //~ this.y=y;
    //~ }
    
    //~ public void mouseDragged(MouseEvent e){}
    //~ public void mouseMoved(MouseEvent e)
    //~ {
        //~ updateXY(e.getX(),e.getY());
        //~ y=e.getY();
        //~ repaint();
    //~ }
    
    //~ public void mouseClicked(MouseEvent e){}
    //~ public void mouseEntered(MouseEvent e){}
    //~ public void mouseExited(MouseEvent e){}
    //~ public void mousePressed(MouseEvent e)
    //~ {
        //~ if(game.haveWon())game=new LightsOutGame();
        //~ updateXY(e.getX(),e.getY());
        //~ int col=x*game.WIDTH/getWidth();
        //~ int row=y*game.HEIGHT/getHeight();
        //~ game.click(col,row);
        //~ System.out.println(game);
        //~ System.out.println();
        //~ repaint();
    //~ }
    //~ public void mouseReleased(MouseEvent e){}
    
//~ }












//~ class LightsOutGame
//~ {
    //~ //instance variables
    //~ public static final int WIDTH=4;
    //~ public static final int HEIGHT=4;
    
    //~ boolean[][] board=new boolean[WIDTH][HEIGHT];
    
    //~ //constructor
    //~ public LightsOutGame()
    //~ {
        //~ randomize();
    //~ }
    
    //~ //methods/funcs
    //~ public void randomize()
    //~ {
        //~ for(int i=0;i<WIDTH;i++)
            //~ for(int j=0;j<HEIGHT;j++)
                //~ if(Math.random()<.5)
                    //~ click(i,j);
    //~ }
    
    //~ public void click(int x, int y)
    //~ {
        //~ if(x<0 || x>=WIDTH || y<0 || y>=HEIGHT) return;
        
        //~ board[x][y]=!board[x][y];
        //~ if(x>0) board[x-1][y]=!board[x-1][y];
        //~ if(x<WIDTH-1) board[x+1][y]=!board[x+1][y];
        //~ if(y>0) board[x][y-1]=!board[x][y-1];
        //~ if(y<HEIGHT-1) board[x][y+1]=!board[x][y+1];
    //~ }
    
    //~ public boolean haveWon()
    //~ {
        //~ for(int i=0;i<WIDTH;i++)
            //~ for(int j=0;j<HEIGHT;j++)
                //~ if(board[i][j])return false;
        //~ return true;
    //~ }
    
    //~ public String toString()
    //~ {
        //~ String s="";
        //~ for(int j=0;j<HEIGHT;j++)
        //~ {
            //~ s+="|";
            //~ for(int i=0;i<WIDTH;i++)
            //~ {
                //~ //expression?trueValue:falseValue
                //~ //s+=board[i][j]?"*":".";
                //~ if(board[i][j]) s+=" * ";
                //~ else s+=" . ";
            //~ }
            //~ s+="|\n";
        //~ }
        //~ return s;
    //~ }
    
    
//~ }
