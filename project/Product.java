
public class Product {
	
	public String itemName;//name of item
	public double price;//price of the item
	public int numOfUnits;//amount of the units in the store
	public int sku;//the sku number
	
	public Product(String n,double p,int num) {//creates a product with the inputed values
		itemName=n;
		price=p;
		numOfUnits=num;
		sku=generateSKU();
	}
	
	public String getItemName() {//gives the items name
		return itemName;
	}
	
	public double getPrice() {//gives the items price
		return price;
	}
	
	public void addInv(int num) {//adds inventory for a product
		numOfUnits+=num;
	}
	
	public void remInv(int num) {//removes inventory from a product
		numOfUnits-=num;
	}
	
	public int generateSKU() {// generates a random sku # each time its called between 1 and 10000
		int sku=(int)(Math.random()*(10000-1)+1);
		return sku;
	}
	

}
