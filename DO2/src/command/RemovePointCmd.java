package command;

import mvc.DrawingModel;
import mvc.Point;

public class RemovePointCmd implements Command {
	private DrawingModel model;
	private Point point;

	public RemovePointCmd(DrawingModel model, Point point) {
		super();
		this.model = model;
		this.point = point;
	}

	@Override
	public void execute() {
		model.remove(point);

	}

	@Override
	public void unexecute() {
		model.add(point);

	}

}
