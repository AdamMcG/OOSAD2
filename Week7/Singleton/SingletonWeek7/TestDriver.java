package Singleton.SingletonWeek7;

public class TestDriver {

	public static void main(String[] args) {
	for(int i = 0; i < 10; i++){
	DBConnection test = DBConnection.getInstance(i);	
	System.out.println(test.toString());	
	}
	System.out.println("Darn");
	}
}
