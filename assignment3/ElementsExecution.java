package assignment3;

public class ElementsExecution extends ButtonM {

	public static void main(String[] args) {
	WebelementGF ele = new WebelementGF();
	ButtonM but = new ButtonM();
	TextfieldF txt = new TextfieldF();
	Checkboxbutton1 cb = new Checkboxbutton1();
	Radiobutton2 rb = new Radiobutton2();
	
	ele.click();
    ele.setText("jamu");
      
    txt.getText();
    txt.click();
    txt.setText("praba");
    
    rb.selectRadioButton();
    rb.Submit();
    
    cb.clickCheckButton();
    cb.Submit();
    
	but.click();
	but.setText("aryan");
	but.Submit();
	
	}

}
