package newinterface;

public interface RBI {
	
	
	int UPILimit= 100000;
	

	public void aadharMandatory();
	
	public void aadharManatory(boolean a);
	
	public boolean panMandatory();
	
	
	default void housingLoan() {
	System.out.println("House loan approved");
	}
	
	static void mortageLoan() {
	System.out.println("loan sanctioned");
		
	}

}
