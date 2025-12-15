
public class Clothing extends Product {
	
	public String clothingType;//is it a t-shirt, pants, sweater, etc
	public String color;//what is the color: red, green, blue, etc
	
	public Clothing(String n,double p,int num,String ct,String c) {//puts name, price and number of items into the superclass and adds the type and color
		super(n,p,num);
		clothingType=ct;
		color=c;
	}
	

}
