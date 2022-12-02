package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mvc.Point;
import mvc.Shape;

public class SremBanatBacka extends Shape {
	private List<Point> sremBanatBacka = new ArrayList<Point>();
	
	public void add(Point p) {
		sremBanatBacka.add(p);
	}
	
	public void remove(Point p) {
		sremBanatBacka.remove(p);
	}

	@Override
	public void draw(Graphics g) {
		Iterator<Point> it = sremBanatBacka.iterator();
		while(it.hasNext()) {
			it.next().draw(g);
		}
		
	}

}
