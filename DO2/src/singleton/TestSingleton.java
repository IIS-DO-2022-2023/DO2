package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		System.out.println("Eager:");
		DatabaseConnection db1 = DatabaseConnection.getInstance();
		System.out.println(db1);
		
		DatabaseConnection db2 = DatabaseConnection.getInstance();
		System.out.println(db2);
		
		System.out.println("Lazy:");
		DatabaseConnectionLazy dbl1 = DatabaseConnectionLazy.getInstance();
		System.out.println(dbl1);
		
		DatabaseConnectionLazy dbl2 = DatabaseConnectionLazy.getInstance();
		System.out.println(dbl2);
		
		
		

	}

}
