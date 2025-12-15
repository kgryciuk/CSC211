
public class Grocery extends Product {
	
	public boolean nonperishable;//true if the food is nonperishable false if perishable
	public String area;//where would the item be: canned goods, meats, dairy, etc.
	public int daysTilExpire;//what the best by date on the product is (-1 set for nonperishables)
	
	public Grocery(String n,double p,int num,boolean np,String a,int b) {//puts name, price and number of items into the superclass and adds if the food is perishable or not, where it would be located and # of days until expires
		super(n,p,num);
		nonperishable=np;
		area=a;
		if(np==true)
			daysTilExpire=-1;
		else
			daysTilExpire=b;
	}
	
	public String dayPass() {// on call this will "pass a day" and make the perisable foods 1 day closer to expiring and will let you know if it does/ is
		if(daysTilExpire==0)
			return "Item is out of date.";
		else if(daysTilExpire>0) {
			daysTilExpire--;
			return this.getItemName()+" is now "+daysTilExpire+" days from expiring";
		}
		else
			return "Item is nonperishable.";
		
	}
	

}
