package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Line;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		Point p1 = new Point(10, 10, Color.RED);
		Point p2 = new Point(20, 20, Color.BLACK);
		
		DrawingModel model = new DrawingModel();
		
		AddPointCmd addPoint = new AddPointCmd(model, p1);
		addPoint.execute();
		System.out.println(model.getShapes().size());
		
		RemovePointCmd removePoint = new RemovePointCmd(model, p1);
		removePoint.execute();
		System.out.println(model.getShapes().size());
		
		UpdatePointCmd updatePoint = new UpdatePointCmd(p1, p2);
		updatePoint.execute();
		System.out.println(p1);
		System.out.println(p2);
		
		updatePoint.unexecute();
		System.out.println(p1);
		System.out.println(p2);
		
		//p1 = p2;
		
		Point p3 = new Point(30, 30, Color.RED);
		Point p4 = new Point(40, 40, Color.BLACK);

		Line lin1 = new Line(p1, p2);
		Line lin2 = new Line(p3, p4);

		UpdateLineCmd updateLine = new UpdateLineCmd(lin1, lin2);
		updateLine.execute();

		System.out.println(lin1);

		p3.setX(100);

		System.out.println(lin1);
		

	}

}
