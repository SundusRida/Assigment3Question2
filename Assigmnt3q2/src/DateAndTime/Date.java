package DateAndTime;
import javax.swing.JOptionPane;
public class Date {
private int day,month,year;
public Date()
{
	day=0;
	month=0;
	year=0;
}
public Date(int d,int m,int y)
{
	day=d;
	month=m;
	year=y;
}
 
public int getDay()
{
	return day;
}
public void setDate(int d)
{
	day=d;
}
public int getMonth()
{
	return month;
}
public void setMonth(int m)
{
	month=m;
}
public int getYear()
{
	return year;
}
public void setYear(int y)
{
	year=y;
}
public void input()
{
	String n=JOptionPane.showInputDialog("Enter day: ");
	day=Integer.parseInt(n);
	String a=JOptionPane.showInputDialog("Enter month: ");
	month=Integer.parseInt(a);
	String r=JOptionPane.showInputDialog("Enter year: ");
	year=Integer.parseInt(r);
}
public String toString()
{
	return day+"/"+month+"/"+year;
}
}
