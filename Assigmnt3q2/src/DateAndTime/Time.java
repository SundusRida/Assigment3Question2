package DateAndTime;

public class Time {
	private int hour,min;
	private String ap;
	public Time()
	{
		hour=0;
		min=0;
		ap="";
	}
	public Time(int h,int m,String aa)
	{
		hour=h;
		min=m;
		ap=aa;
	}
	public int gethour()
	{
		return hour;
	}
	public void sethour(int h)
	{
		hour=h;
	}
	public int getMin()
	{
		return min;
	}
	public void setMin(int m)
	{
		min=m;
	}
	public String getAP()
	{
		return ap;
	}
 public	void setAP(String a)
	{
		ap=a;
	}
 public String toString()
 {
 	return hour+":"+min+":"+ap;
 }
}
