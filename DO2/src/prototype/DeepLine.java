package prototype;

import java.awt.Color;
//import java.awt.Graphics;

import mvc.Point;

public class DeepLine implements Cloneable {
	private Point startPoint = new Point();
	private Point endPoint = new Point();
	Color color;

	public DeepLine(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public DeepLine(Point startPoint, Point endPoint, Color color) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.color = color;
	}

	public DeepLine() {
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

//	@Override
//	public void draw(Graphics g) {
//		// TODO Auto-generated method stub
//
//	}

//	@Override
//	public String toString() {
//		return "Line [startPoint=" + startPoint + ", endPoint=" + endPoint + "]";
//	}
	
	@Override
	public DeepLine clone() {
		DeepLine line = new DeepLine();
		line.getStartPoint().setX(this.getStartPoint().getX());
		line.getStartPoint().setY(this.getStartPoint().getY());

		line.getEndPoint().setX(this.getEndPoint().getX());
		line.getEndPoint().setY(this.getEndPoint().getY());

		line.setColor(this.getColor());

		return line;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
