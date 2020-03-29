package myJava1;

import javax.swing.JOptionPane;

public class MyAuto {
	
	public static void main(String[] args) {
		
//		we use JOptionpane for input
		
		String vorname = JOptionPane.showInputDialog("Geben Sie Ihr Vorname ein! ");
		String nachName = JOptionPane.showInputDialog("Geben Sie Ihr Nach Name!");
		
		String fullName = vorname +" " + nachName;
		
		
		JOptionPane.showMessageDialog(null, "Guten Tag Herr " + fullName.toUpperCase());
		
		String autoMarke=JOptionPane.showInputDialog("Sagen Sie Ihr lieblings Auto!");
		
		switch (autoMarke.toLowerCase()) {
		case "mercedes": //Fall-through
		case "vw":
		case "audi":
			JOptionPane.showMessageDialog(null, "Herr " + nachName.toUpperCase() +", ich fahre auch gerne " + autoMarke);
			break;
		case "ferrari": // Fall-through
		case "lambourgini":
			JOptionPane.showMessageDialog(null, "Herr " + nachName.toUpperCase() +", " + autoMarke + " ist geil");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Herr " + nachName.toUpperCase() + " ist " + autoMarke + " ein Auto?");
			break;
		}
		
		
	}

}
