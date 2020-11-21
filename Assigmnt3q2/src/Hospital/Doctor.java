package Hospital;

import javax.swing.JOptionPane;

public class Doctor {
	private	String name, cnic, dprt,speclz, phNum;
	private	char gender;
	
	Doctor()
	{
		name="";
		cnic="";
		dprt="";
		speclz="";
		phNum="";
		gender='0';
	}
	Doctor(String n,String c,String d,String s,String p,char g)
	{
		name=n;
		cnic=c;
		dprt=d;
		speclz=s;
		phNum=p;
		gender=g;
	}
	public String getDName()
	{
		return name;
	}
	void setName(String n)
	{
		name=n;
	}
	public String getCnic()
	{
		return cnic;
	}
	void setCnic(String c)
	{
		cnic=c;
	}
	public String getPhNum()
	{
		return phNum;
	}
	void setphNum(String p)
	{
		phNum=p;
	}
	public String getspecial()
	{
		return speclz;
	}
	void setSpecial(String s)
	{
		speclz=s;
	}
	public char getGender()
	{
		return gender;
	}
	
	
	void setGender(char g)
	{
		gender=g;
	}
public String getDepartment() {
		
		return dprt;
	}

	
	void setDepartment(String d)
	{
		dprt=d;
	}
	public String  display()
	{
		return ("Name is: "+name+"\nCNIC is: "+cnic+"\nDepartment is: "+dprt+"\nSpecialization is: "+speclz+"\nPhone number is: "+phNum+"\nGender is: "+gender);
		
	}
	public void view()
	{
		JOptionPane.showMessageDialog(null,"Name is: "+name+"\nCNIC is: "+cnic+"\nDepartment is: "+dprt+"\nSpecialization is: "+speclz+"\nPhone number is: "+phNum+"\nGender is: "+gender,"Doctor Record",JOptionPane.WARNING_MESSAGE);
	}
	
	}
