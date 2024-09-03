package assignment3;

public class Logintestdata2assign extends Testdata2assign {
public void enterUsername() {
	System.out.println("username entered");
}
	public void enterPassword() {
		System.out.println("password entered");
	}

	public static void main(String[] args) {
		Logintestdata2assign ltd = new Logintestdata2assign();
		ltd.entercrediantials();
		ltd.enterUsername();
		ltd.navigatetohomepage();
		ltd.enterPassword();

	}

}
