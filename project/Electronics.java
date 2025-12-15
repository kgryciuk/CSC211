
public class Electronics extends Product {//inherits from product class
	
	public String deviceType;//is it a phone, laptop, computer, etc
	public String brand;//who made it apple samsung, google, etc
	public int year;//year device was released ex 2024
	
	public Electronics(String n,double p,int num,String t,String b,int y) {
		super(n,p,num);
		deviceType=t;
		brand=b;
		year=y;
	}
	
}