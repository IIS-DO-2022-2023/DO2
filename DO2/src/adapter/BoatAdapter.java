package adapter;

public class BoatAdapter implements Vehicle {
	private Boat boat;
	
	
	public BoatAdapter(Boat boat) {
		super();
		this.boat = boat;
	}

	@Override
	public void moveFaster() {
		boat.rowFaster();

	}

}
