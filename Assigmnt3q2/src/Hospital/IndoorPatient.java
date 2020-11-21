package Hospital;
import DateAndTime.Date;
import javax.swing.JOptionPane;
public class IndoorPatient extends Patient {

	 private int wardno,roomNo,bedNo;
	 private double fee;
	private  Doctor doc=new Doctor();
	private Date date=new Date();
	

	 public IndoorPatient() {
			super();
			this.date=new Date();
			this.doc=new Doctor();
		 wardno=0;
		 roomNo=0;
		 bedNo=0;
		 fee=0;
	}
	 
		public IndoorPatient(String n,String c,String a,String p,char g,int ag,int w,int r,int b,double f,int d,int m,int y,Doctor d2) {
			super(n,c,a,p,g,ag);
			this.date=new Date(d,m,y);
			doc=d2;
			 wardno=w;
			 roomNo=r;
			 bedNo=b;
			 fee=f;
			 
					
			date.setDate(d);
			date.setDate(m);
			date.setDate(y);
			 }
		
		Doctor getDoc()
		{
			return doc;
		}
		Date getDate()
		{
			return date;
		}
		int getRoom()
		{
			return roomNo;
		}
		void setRoom(int r)
		{
			roomNo=r;
		}
		int getward()
		{
			return wardno;
		}
		void setward(int w)
		{
			wardno=w;;
		}
		int getbed()
		{
			return bedNo;
		}
		void setBed(int b)
		{
			bedNo=b;
		}
		double getFee()
		{
			return fee;
		}
		void setFee(double f)
		{
			fee=f;
		}
       public void addIndoor(Doctor[] d)
		{
        	super.input();
			
		
			String n=JOptionPane.showInputDialog("Enter ward number: ");
			setward(Integer.parseInt(n));
			String r=JOptionPane.showInputDialog("Enter room number: ");
			setRoom(Integer.parseInt(r));
			String b=JOptionPane.showInputDialog("Enter bed Number: ");
			setBed(Integer.parseInt(b));
			String f=JOptionPane.showInputDialog("Enter fee: ");
			setFee(Double.parseDouble(f));
				
			String n1=JOptionPane.showInputDialog("Enter day: ");
			date.setDate(Integer.parseInt(n1));
			String a=JOptionPane.showInputDialog("Enter month: ");
			date.setMonth(Integer.parseInt(a));
			String r1=JOptionPane.showInputDialog("Enter year: ");
			date.setYear(Integer.parseInt(r1));
	
			{String r2=JOptionPane.showInputDialog("Enter Doctor name: ");
			for(int i=0;i<d.length;i++) {
			if(r2.equalsIgnoreCase(d[i].getDName()))
			{
				
			doc.setName(d[i].getDName());
			doc.setCnic(d[i].getCnic());
			doc.setDepartment(d[i].getDepartment());
			doc.setSpecial(d[i].getspecial());
			doc.setphNum(d[i].getPhNum());
			doc.setGender(d[i].getGender());	
			}
			}
			}
		
		}
		
		public void view()
		{
			super.display();
			JOptionPane.showMessageDialog(null,"Ward number: "+wardno+"\nRoom Number: "+roomNo+"\nBed Number: "+bedNo+"\nFee: "+fee+"\nDate is: "+date.toString()+"\nDoctor: "+doc.display()," Other Information",JOptionPane.WARNING_MESSAGE);
			
		}

		public int getDay() {
			return date.getDay();
		}

		public int getYear() {
			
			return date.getYear();
		}

		public int getMonth() {
			
			return date.getMonth();
		}
		
}

