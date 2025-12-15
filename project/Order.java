import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private List<Product>orderList=new ArrayList<>();
	private double total=0;
	
	Product e1=new Electronics("Iphone 14",999.99,100,"phone","Apple",2022);
	Product e2=new Electronics("Ipad Air 6",1299.89,50,"tablet","Apple",2024);
	Product e3=new Electronics("Google Pixel 10",799.99,75,"phone","Google",2022);
	Product e4=new Electronics("Acer Nitro 5",889.79,100,"laptop","Acer",2022);
	Product g1=new Grocery("Chicken noodle soup",4.49,300,true,"Canned Goods",1);
	Product g2=new Grocery("Fresh baby carrots",6.19,450,false,"Vegetable",8);
	Product g3=new Grocery("2 lb Spagetti noddles",3.89,325,true,"Canned Goods");
	Product c1=new Clothing("Farmingdale State College Shirt",38.98,50,"T-shirt","Green");
	Product c2=new Clothing("Jeans",10.78,50,"Pants","Blue");
	Product c3=new Clothing("Under Armour Jacket",58.99,20,"Sweatshirt","Red");
	Product c4=new Clothing("Under Armour Shirt 2 pk",25.49,70,"Long sleeve","Black");
	
	public Order() {//adds e1, e3, g1, g2, c1, c2, c3, and c4 to orderList and their prices(-discount) to total)
		PriceCalc taxCalc=tot->tot+(tot*.075);//lambda to find tax of 7.5%
        PriceDisc discount25=price->price-(price*.25);//discount for 25% off
        PriceDisc discount10=price->price-(price*.1);//discount for 10% off
		orderList.add(e1);
		total+=e1.getPrice();
		orderList.add(e3);
		total+=discount25.discount(e3.getPrice());
		orderList.add(g1);
		total+=g1.getPrice();
		orderList.add(g2);
		total+=g3.getPrice();
		orderList.add(c1);
		total+=c1.getPrice();
		orderList.add(c2);
		total+=c2.getPrice();
		orderList.add(c3);
		total+=discount10.discount(c3.getPrice());
		orderList.add(c4);
		total+=c4.getPrice();
		PriceCalc finalPrice=tot -> tot+(tot*.075);
		finalPrice.calculate(total);
		System.out.println("The order contains "+orderList+"\nThe total price after taxes and discounts is: $"+total);
	}
	
}