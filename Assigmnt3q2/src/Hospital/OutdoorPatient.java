package Hospital;
import javax.swing.JOptionPane;
import DateAndTime.Date;
import DateAndTime.Time;
public class OutdoorPatient extends Patient {
 Date dateApp=new Date();
 Time timeApp=new Time();
 Doctor doc=new Doctor();

 
	public OutdoorPatient() {
		super();
		this.dateApp=new Date();
		this.timeApp=new Time();
		this.doc=new Doctor();
	}
	
	public OutdoorPatient(String n,String c,String a,String p,char g,int ag,double f,int d,int m,int y,int h,int mi,String ampm,Doctor d2) {
		super(n,c,a,p,g,ag);
		this.dateApp=new Date(d,m,y);
		this.timeApp=new Time(h,mi,ampm);
		doc=d2;
		 dateApp.setDate(d);
			dateApp.setDate(m);
			dateApp.setDate(y);
			timeApp.sethour(h);
			timeApp.setMin(mi);
			timeApp.setAP(ampm);
		 }
	public void addOutdoor(Doctor[] d)
	{
		super.input();
		
		String n1=JOptionPane.showInputDialog("Enter day: ");
		dateApp.setDate(Integer.parseInt(n1));
		String a=JOptionPane.showInputDialog("Enter month: ");
		dateApp.setMonth(Integer.parseInt(a));
		String r1=JOptionPane.showInputDialog("Enter year: ");
		dateApp.setYear(Integer.parseInt(r1));
		
		String x1=JOptionPane.showInputDialog("Enter hours: ");
		timeApp.sethour(Integer.parseInt(x1));
		String a1=JOptionPane.showInputDialog("Enter minutes: ");
		timeApp.setMin(Integer.parseInt(a1));
		timeApp.setAP(JOptionPane.showInputDialog("Enter am/pm: "));
		
		String r2=JOptionPane.showInputDialog("Enter Doctor name: ");
		
		
		for(int i=0;i<d.length;i++) {
			
			if(r2.equalsIgnoreCase(d[i].getDName())) {
		doc.setName(d[i].getDName());
		doc.setCnic(d[i].getCnic());
		doc.setDepartment(d[i].getDepartment());
		doc.setSpecial(d[i].getspecial());
		doc.setphNum(d[i].getPhNum());
		doc.setGender(d[i].getGender());	
		}
	
		}
		
	}
	
	void change(int d,int m,int y,int h,int mi,String ampm)
	{
		 dateApp.setDate(d);
			dateApp.setMonth(m);
			dateApp.setYear(y);
			timeApp.sethour(h);
			timeApp.setMin(mi);
			timeApp.setAP(ampm);
	}

void display()
{
super.display();
	JOptionPane.showMessageDialog(null,"\nDoctor: "+doc.display()+"\nDate of Appointment: "+dateApp.toString()+"\n\"Time of Appointment: "+timeApp.toString(),"Other Information",JOptionPane.WARNING_MESSAGE);
	
}
public int getDay() {
	return dateApp.getDay();
}

public int getYear() {
	
	return dateApp.getYear();
}

public int getMonth() {
	
	return dateApp.getMonth();
}
public int gethour()
{
	return timeApp.gethour();
}
public int getMin()
{
	return timeApp.gethour();
}
public String getAP()
{
	return timeApp.getAP();
}
public String getDName()
{
	return doc.getDName();
}
public String getCnic()
{
	return doc.getCnic();
}
public String getPhNum()
{
	return doc.getPhNum();
}
public String getspecial()
{
	return doc.getspecial();
}
public char getGender()
{
	return doc.getGender();
}
public String getDepartment() {
	
	return doc.getDepartment();
}


}

