package Singleton.SingletonWeek7;

public class DBConnection {

	private static DBConnection instance;
	private int test = 123;	


	private DBConnection() {}

	public static DBConnection getInstance(int i) {	
	if (instance == null) {
            instance = new DBConnection();
	    instance.setTest(i);        }
 
        return instance;
	}

	public String toString(){
	return "Testing" + test;
	}

	public void setTest(int test){
	this.test = test;
	}

	public int getTest(){ return test;}
}
