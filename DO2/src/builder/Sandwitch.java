package builder;

import java.util.ArrayList;
import java.util.List;

public class Sandwitch {
	private String bread;
	private List<String> spreads = new ArrayList<>();
	private List<String> meats = new ArrayList<>();
	private List<String> dressings = new ArrayList<>();
	private List<String> salads = new ArrayList<>();

//	public Sandwitch(String bread, String meat, String spread, String dressing, String salad) {
//		this.bread = bread;
//		spreads.add(spread);
//		meats.add(meat);
//		dressings.add(dressing);
//		salads.add(salad);
//	}

	public Sandwitch(Builder builder) {
		bread = builder.bread;
		spreads = builder.spreads;
		meats = builder.meats;
		salads = builder.salads;
		dressings = builder.dressings;
	}

	@Override
	public String toString() {
		return "Sandwitch [bread=" + bread + ", spreads=" + spreads + ", meats=" + meats + ", dressings=" + dressings
				+ ", salads=" + salads + "]";
	}

	public static class Builder {
		private String bread;
		private List<String> spreads;
		private List<String> meats;
		private List<String> dressings;
		private List<String> salads;

		public Builder(String bread) {
			this.bread = bread;
			spreads = new ArrayList<>();
			meats = new ArrayList<>();
			dressings = new ArrayList<>();
			salads = new ArrayList<>();
		}

		public Builder spread(String spread) {
			spreads.add(spread);
			return this;
		}

		public Builder meat(String meat) {
			meats.add(meat);
			return this;
		}

		public Builder dressing(String dressing) {
			dressings.add(dressing);
			return this;
		}

		public Builder salads(String salad) {
			salads.add(salad);
			return this;
		}

		public Sandwitch build() {
			return new Sandwitch(this);
		}

	}

}
