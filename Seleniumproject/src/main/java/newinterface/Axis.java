package newinterface;

public class Axis implements RBI {
	
	
	public void interestFreeLoan() {
    //RBI.UPILimit=1;
    System.out.println("Freeloan");
		
	}
	

	@Override
	public void aadharMandatory() {
	System.out.println("aadhar added");
		
	}

	@Override
	public boolean panMandatory() {
    return true;
	
	}


	@Override
	public void aadharManatory(boolean a) {
		// TODO Auto-generated method stub
		
	}


	

}
