package newinheritance;

public class Yamaha extends Scooty {

	
	int mileage=30;
	
	
	String getColor()
	{
		return "Black";
	}
	
	public static void main(String[] args) {
	Yamaha myScooty=new Yamaha();
	myScooty.getColor();
	int mileage2=myScooty.mileage;
	System.out.println(mileage2);
	boolean hasDisc= myScooty.hasDisc();
	System.out.println(hasDisc);
	myScooty.applybreak();
	Vechiles myVec=new Vechiles();
	myVec.applybreak();
	
	
	}
}
