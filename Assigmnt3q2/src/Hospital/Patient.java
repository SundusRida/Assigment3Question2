package Hospital;

import javax.swing.JOptionPane;

public class Patient {
private	String name, cnic, address, phNum;
private	char gender;
private	int age;
Patient()
{
	name="";
	cnic="";
	address="";
	phNum="";
	gender='0';
	age=0;}
Patient(String n,String c,String a,String p,char g,int ag)
{
	name=n;
	cnic=c;
	address=a;
	phNum=p;
	gender=g;
	age=ag;
}

void input()
{
	name=JOptionPane.showInputDialog("Enter Patient name: ");
	cnic=JOptionPane.showInputDialog("Enter patient cnic: ");
	address=JOptionPane.showInputDialog("Enter patient address: ");
	phNum=JOptionPane.showInputDialog("Enter patient phNum: ");
	String n=JOptionPane.showInputDialog("Enter patient gender: ");
	
	gender=n.charAt(0);
	String m=JOptionPane.showInputDialog("Enter patient age: ");
	age=Integer.parseInt(m);
}
void display()
{
	JOptionPane.showMessageDialog(null,"Name: "+name+"\nCNIC: "+cnic+"\nAddress: "+address+"\nPhone Number: "+phNum+"\nGender: "+gender+"\nAge: "+age,"Patient Record",JOptionPane.WARNING_MESSAGE);
}

public char getgender() {
	
	return gender;
}
public String getphNum() {

	return phNum;
}
public String getaddress() {
	
	return address;
}
public int getage() {

	return age;
}
public String getcnic() {
	
	return cnic;
}
public String getName() {
	
	return name;
}
public void addOutdoor(Doctor[] d) {
	
	
}
public void addIndoor(Doctor[] d) {
	
	
}

public void view() {
	
	
}



}
