package assignments4;

public class Javaconnection extends MySqlconnection {

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
		System.out.println("executedata");
		
	}
public static void main(String[] args) {
	Javaconnection jc = new Javaconnection();
	jc.connect();
	jc.disconnect();
	jc.executeData();
	jc.executequery();
}
	

	}


