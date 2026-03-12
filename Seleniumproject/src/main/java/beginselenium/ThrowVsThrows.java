package beginselenium;



public class ThrowVsThrows {

	
	public void code() {
		
		
		try {
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			throw new RuntimeException();
		}
		
	}
	
	public static void main(String[] args) {
		
		ThrowVsThrows th= new ThrowVsThrows();
		th.code();
				
		
	}
}
