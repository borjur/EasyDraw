import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;


public class DrawingSurface extends JPanel
{
	ArrayList<Point> points = new ArrayList<Point>();
	ArrayList<ArrayList> bunchOfArrays = new ArrayList<ArrayList>();
	ArrayList<Point> temp;
	
	public DrawingSurface()
	{
		MouseEvents mListener = new MouseEvents();
		addMouseListener(mListener);
		addMouseMotionListener(mListener);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		for(ArrayList<Point> L: bunchOfArrays )
		{	
			
			for(int i = 0; i<L.size() - 1 ; i++)
			{
				Point p = L.get(i);
				Point p1 = L.get(i+1);
				g.drawLine(p.x,p.y, p1.x,p1.y);
			}
		}	
	}
	
	public class MouseEvents extends MouseAdapter
	{
		@Override
		public void mouseDragged(MouseEvent e)
		{
			points.add(e.getPoint());
			repaint();
		}
		
		@Override
		public void mousePressed(MouseEvent e)
		{
			points = new ArrayList<Point>();
			bunchOfArrays.add(points);
			points.add(e.getPoint());
			repaint();
		}

		
	}
	
	
}
