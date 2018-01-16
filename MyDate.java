
public class MyDate implements Comparable<MyDate> 
{

	private int year;
	private int month;
	private int day;
	
	public void setYear(int yy)
	{
		if (yy<9999)
			this.year=yy;
	}
	
	public void setMonth(int mm)
	{
		if (mm>=1 && mm<=12)
			this.month=mm;
		else
			month=1;
	}
	
	public void setDay(int dd)
	{
		if (dd>=1 && dd<=31)
			this.day=dd;
	}
	
	public String toString()
	{
		return this.year+"ƒÍ"+this.month+"‘¬"+this.day+"»’";
	}
	
	public MyDate()
	{
		this.year=2000;
		this.month=1;
		this.day=1;
	}
	
	public MyDate(int year,int month,int day)
	{
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public MyDate(MyDate date)
	{
		this.year=date.year;
		this.month=date.month;
		this.day=date.day;
	}

	@Override
	public int compareTo(MyDate arg0) {
		// TODO Auto-generated method stub
		if (this.year==arg0.year && this.month==arg0.month && this.day==arg0.day)
			return 0;
		else
		{
			return this.year>arg0.year||this.month>arg0.month||this.day>arg0.day?1:-1;
		}
	}
	
	//≤‚ ‘
	public static void main(String[] args)
	{
		MyDate d1,d2;
		
		d1=new MyDate(2009,12,1);
		
		d2=new MyDate(d1);
		
		d2.setDay(28);
		
		System.out.println("d1:d2="+d1.compareTo(d2));
		
	}
}
