package prototype;

import java.awt.Color;
import java.awt.Graphics;

import mvc.Point;
import mvc.Shape;

public class ShallowLine extends Shape implements Cloneable {
	private Point startPoint = new Point();
	private Point endPoint = new Point();
	Color color;

	public ShallowLine(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public ShallowLine(Point startPoint, Point endPoint, Color color) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.color = color;
	}

	public ShallowLine() {
		// TODO Auto-generated constructor stub
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

	}

//	@Override
//	public String toString() {
//		return "Line [startPoint=" + startPoint + ", endPoint=" + endPoint + "]";
//	}
	
	@Override
	public ShallowLine clone() {
		try {
			ShallowLine line = (ShallowLine) super.clone();
			return line;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
