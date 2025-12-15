
public class Clothing extends Product {
	
	public String clothingType;//is it a t-shirt, pants, sweater, etc
	public String color;//what is the color: red, green, blue, etc
	
	public Clothing(String n,double p,int num,String ct,String c) {
		super(n,p,num);
		clothingType=ct;
		color=c;
	}
	
}