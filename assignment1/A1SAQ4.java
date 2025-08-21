package assignment1;
public class A1SAQ4 {
	int dd;
	int mm;
	int yy;

	public A1SAQ4(){
		this.dd=05;
		this.mm=05;
		this.yy=25;
	}
	public A1SAQ4(int dd,int mm, int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	
	public void display()
	{
		System.out.println( "date:"+dd+"-"+mm+"-"+yy);
	}	
	
	public static void main(String[] args)
	{
		A1SAQ4 date=new A1SAQ4();
		date.display();
		A1SAQ4 date2=new A1SAQ4(04,06,55);
		date2.display();
		
	}

}
