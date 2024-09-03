package assignments4;

public class Execution implements Databaseconnections  {

	@Override
	public void connect() {
		System.out.println("connected");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnected");
		
	}

	@Override
	public void executeData() {
	System.out.println("executedandupdated");
		
	}
public static void main(String[] args) {
	Execution e = new Execution();
	e.connect();
	e.disconnect();
	e.executeData();
	
}
}
