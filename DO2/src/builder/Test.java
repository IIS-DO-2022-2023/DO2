package builder;

public class Test {

	public static void main(String[] args) {
		Sandwitch.Builder builder = new Sandwitch.Builder("integralna");

		builder.meat("pecenica").salads("zelena").dressing("ruska").meat("suvi vrat").dressing("kecap");

		Sandwitch sandwitch = builder.build();

		System.out.println(sandwitch);

	}

}
