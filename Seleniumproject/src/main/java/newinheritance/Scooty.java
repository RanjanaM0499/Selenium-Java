package newinheritance;

public class Scooty extends Vechiles {
	
	
	public boolean hasDisc()
	{
		return true;
		
	}
	
	@Override
	public void applybreak() {
	super.applybreak();
    System.out.println("Scooty --BreakApplied");

}
} 