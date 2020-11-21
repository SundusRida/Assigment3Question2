package Hospital;
import javax.swing.JOptionPane;
public class demo {
	
	public static void  main(String args[]) {

		Doctor[] d=new Doctor[5];
		d[0]=new Doctor("sana","37406-4072619-2","chardiology","mbbs","0300-983474",'f');
		d[1]=new Doctor("saba","37406-4072619-2","chardiology","mbbs","0300-983474",'f');
		d[2]=new Doctor("sabiha","37406-4072619-2","chardiology","mbbs","0300-983474",'f');
		d[3]=new Doctor("sawera","37406-4072619-2","chardiology","mbbs","0300-983474",'f');
		d[4]=new Doctor("salwa","37406-4072619-2","chardiology","mbbs","0300-983474",'f');                                
		int c1=1;
 Patient p1[]=new Patient[3];
 for(int k=0;k<p1.length;k++) {
 String a=JOptionPane.showInputDialog("Which refernce do you want on index " +k);
 if(a.equalsIgnoreCase("Outdoor"))
 {
    p1[k]=new OutdoorPatient();
  
 }
 else if(a.equalsIgnoreCase("Indoor"))
 {
 
p1[k]=new IndoorPatient();

 }
 else
	 continue;
 }
 while(c1==1){
	 JOptionPane.showMessageDialog(null,"1-	Add an indoor patient\n2-  Add an outdoor patient\n3-	See the list of all Doctors\n4-	Search a doctor by name or department\n5-	See the list of all indoor patients"
				+"\n6-	See the list of all appointments on a certain day\n7-	See the list of appointments of a certain doctor\n8-	Change the date or time of appointment of a certain patient");
		String m1=JOptionPane.showInputDialog("Enter option: ");
		int n2=Integer.parseInt(m1);
		switch(n2)
		{
		case 1:{
			
			for(int i=0;i<p1.length;i++){
				if(p1[i] instanceof IndoorPatient)
				 p1[i].addIndoor(d);
		}
			
		}
		break;
		case 2:{
			
			for(int j=0;j<p1.length;j++)
		{
				if(p1[j] instanceof OutdoorPatient)
			p1[j].addOutdoor(d);
			
		}
		
			break;
		}
		case 3:{
			for(int i=0;i<d.length;i++){
			
				d[i].view();
				
	                 }
			}
			break;
			case 4:
			{
				String m=JOptionPane.showInputDialog("Enter 1 for Doctor name or 2 for department name: ");
				int n=Integer.parseInt(m);
				if(n==1) 
				{
				String n1=JOptionPane.showInputDialog("Enter Doctor name for searching: ");
				for(int i=0;i<d.length;i++)
				{
					if(n1.equalsIgnoreCase(d[i].getDName()))
					{
						d[i].view();
						
						
					}
					
				}
				
				}
				else if(n==2)
				{
					String n1=JOptionPane.showInputDialog("Enter Doctor department for searching: ");
					for(int i=0;i<d.length;i++)
					{
						if(n1.equalsIgnoreCase(d[i].getDepartment()))
						{
							d[i].view();
							
							
						}
					}
				}
					else 
						JOptionPane.showMessageDialog(null,"***Invalid option",null,JOptionPane.WARNING_MESSAGE);
				}
			
			break;
			
			
			case 5:{
				for(int i=0;i<p1.length;i++)
				{
					if(p1[i] instanceof IndoorPatient)
					p1[i].view();
				}
			}
			break; 
			case 6:
			{
				
				String n3=JOptionPane.showInputDialog("Enter Day for check appoinments: ");
				int m3=Integer.parseInt(n3);
				String n4=JOptionPane.showInputDialog("Enter month for check appoinments: ");
				int m4=Integer.parseInt(n4);
				String n6=JOptionPane.showInputDialog("Enter year for check appoinments: ");
				int m6=Integer.parseInt(n6);
				for(int i=0;i<p1.length;i++) {
					if(p1[i] instanceof OutdoorPatient) {
				if(m3==((OutdoorPatient) p1[i]).getDay()|| m4==((OutdoorPatient) p1[i]).getMonth()&&m6==((OutdoorPatient) p1[i]).getYear())
				{
					p1[i].display();
				}
				
			}
			}
			}
			break;
			case 7:{
				String m=JOptionPane.showInputDialog("Enter Doctor name: ");
				for(int i=0;i<p1.length;i++)
				{
					if(p1[i] instanceof OutdoorPatient) {
					if(m.equalsIgnoreCase(((OutdoorPatient) p1[i]).getDName()))
					{
						p1[i].display();
						
						
					}
					}
			}
			}
			break;
		case 8:{
			String m=JOptionPane.showInputDialog("Enter Patient: ");
		for(int i=0;i<p1.length;i++) {
			if(p1[i] instanceof OutdoorPatient) {
			if(m.equalsIgnoreCase(p1[i].getName()))
			{
				String n3=JOptionPane.showInputDialog("Enter Day,you want to change: ");
				int m3=Integer.parseInt(n3);
				String n4=JOptionPane.showInputDialog("Enter month,you want to change: ");
				int m4=Integer.parseInt(n4);
				String n6=JOptionPane.showInputDialog("Enter year,you want to change: ");
				int m6=Integer.parseInt(n6);
				String n7=JOptionPane.showInputDialog("Enter hour,you want to change: ");
				int m7=Integer.parseInt(n7);
				String n8=JOptionPane.showInputDialog("Enter minutes,you want to change: ");
				int m8=Integer.parseInt(n8);
				String n9=JOptionPane.showInputDialog("Enter am/pm,you want to change: ");
			 ((OutdoorPatient) p1[i]).change(m3,m4,m6,m7,m8,n9);
				p1[i].display();
				
			}
			}
			
		}
		}
			break;
		default:
			JOptionPane.showMessageDialog(null,"***invalid",null,JOptionPane.WARNING_MESSAGE);
		
		}
		String n5=JOptionPane.showInputDialog("***Do you want to continue press 1 ");
		c1=Integer.parseInt(n5);
		}
 
	
	}
}


